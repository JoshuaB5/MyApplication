package com.example.patrickweijs.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupWindow;



public class MainActivity extends ActionBarActivity {
Button fotoClick;
Button textClick;
Button fotoTextClick;
Button soundClick;
PopupWindow pw;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Muur");
        super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fotoClick = (Button) findViewById(R.id.I_Button);
        fotoClick.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v)

            {

                startActivity(new Intent(MainActivity.this, YouTubePlayerFragmentActivity.class));

            }


        });

        //popup voor namenlijst
        textClick = (Button) findViewById(R.id.T_Button);
        textClick.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v)

            {
                startActivity(new Intent(MainActivity.this, ListActivity.class));

            }
        });


        //popup voor verhaal
        fotoTextClick = (Button) findViewById(R.id.IT_Button);
        fotoTextClick.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v)

            {

                //this is the code for popup window
                LayoutInflater inflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                //Here x is the name of the xml which contains the popup components
                PopupWindow  pw = new PopupWindow(inflater.inflate(R.layout.popup3,null, false),2200,1500,true);
                pw.setBackgroundDrawable(new BitmapDrawable());
                //Here y is the id of the root component
                pw.showAtLocation(findViewById(R.id.deze), Gravity.CENTER, 0,0);
            }
        });



        //popup voor audio
        soundClick = (Button) findViewById(R.id.S_Button);
        soundClick.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v)

            {

                startActivity(new Intent(MainActivity.this, AudioActivity.class));

            }
        });

    }


   /*private void Mijn(){

      // this is the code for popup window
            LayoutInflater inflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View popupView1 = inflater.inflate(R.layout.popup1, null, false);
            //Here x is the name of the xml which contains the popup components
            pw = new PopupWindow(inflater.inflate(R.layout.popup1, null, false), 2200, 800, true);
            pw.setBackgroundDrawable(new BitmapDrawable());
            //Here y is the id of the root component
            pw.showAtLocation(findViewById(R.id.deze), Gravity.CENTER, 0, 0);

   }*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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
