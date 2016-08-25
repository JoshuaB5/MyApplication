package com.example.patrickweijs.myapplication;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.widget.ImageButton;

public class AudioActivity extends AppCompatActivity {

private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Muur");
        super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup4);

        mp = MediaPlayer.create(this, R.raw.rickastley);

        /*Playing the audio*/
        ImageButton play_button = (ImageButton)this.findViewById(R.id.Play);
        play_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp.start();
                mp.isPlaying();
            }
        });

        /*Pausing the audio*/
        ImageButton stop_button = (ImageButton)this.findViewById(R.id.Stop);
        stop_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp.pause();
            }
        });

        /*Replaying the audio from the beginning*/
        ImageButton refresh_button = (ImageButton)this.findViewById(R.id.Refresh);
        refresh_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp.seekTo(0);
                mp.start();
                mp.isPlaying();
            }
        });


    }

    /*Override for stopping the mediaplayer, or it will run in the background. And when opening the player again
    it will duplicate the already playing file, leading to two audio playing at once*/
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (mp.isPlaying()) {
            mp.stop(); // or mp.pause();
            mp.release();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case R.id.lobbies:
                finish();
                startActivity(new Intent(getApplicationContext(), OverJoodsMonument.class));
                return true;
            case R.id.lobbycreation:
                finish();
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                return true;
            case R.id.muur:
                finish();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
