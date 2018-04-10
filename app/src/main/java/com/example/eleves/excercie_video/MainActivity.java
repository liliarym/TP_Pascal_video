package com.example.eleves.excercie_video;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



public class MainActivity extends AppCompatActivity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);




        VideoView videoView = (VideoView)findViewById(R.id.videoView);
        String uriPath = "android.resource://com.example.eleves.excercie_video/"+R.raw.video;

        Uri uri = Uri.parse(uriPath);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();


    }
}
