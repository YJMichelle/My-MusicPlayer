package com.example.mymusicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

//create a service which is extending to the Service class
public class MyService extends Service {

    //constructor (not mandatory)
    //goal: to create a media player which should work with the MediaPlayer(built-in class in android)
    private MediaPlayer player;

    public MyService() {

    }

    //not mandatory
    @Override
    public  int onStartCommand(Intent intent, int flags, int startId) {

            //initial, create an object of MediaPlayer on every start command
            //whenever you are going to call start service
            //directory type raw -> Arbitrary files to save in their raw form
            player =  MediaPlayer.create(this, R.raw.song)

            return super.onStartCommand(intent, flags, startId);
    }

    //mandatory!!! it's abstract function from Service class
    @Override
    public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException("Not yet implemented");
    }

    //not mandatory
    @Override
    public void onDestroy() {

            super.onDestroy();
    }
}
