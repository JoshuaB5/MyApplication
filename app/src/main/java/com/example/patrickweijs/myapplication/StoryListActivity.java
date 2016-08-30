package com.example.patrickweijs.myapplication;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StoryListActivity extends AppCompatActivity {

    TextView veld;

    TextView verhaal1;
    TextView verhaal2;
    TextView verhaal3;
    TextView verhaal4;
    TextView verhaal5;
    TextView verhaal6;
    TextView verhaal7;
    TextView verhaal8;
    TextView verhaal9;
    TextView verhaal10;
    TextView verhaal11;
    TextView verhaal12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Muur");
        super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_list);
        //het lege veld waar het verhaal in komt
        veld = (TextView) findViewById(R.id.veld);

        //label waar op gedrukt wordt om het lege veld te vullen
        verhaal1 = (TextView) findViewById(R.id.verhaal1);
        verhaal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {

                veld.setText(R.string.verhaal1);

            }

        });

        //label waar op gedrukt wordt om het lege veld te vullen
        verhaal2 = (TextView) findViewById(R.id.verhaal2);
        verhaal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                veld.setText(R.string.verhaal2);
            }

        });

        //label waar op gedrukt wordt om het lege veld te vullen
        verhaal3 = (TextView) findViewById(R.id.verhaal3);
        verhaal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                veld.setText(R.string.verhaal3);
            }

        });

        //label waar op gedrukt wordt om het lege veld te vullen
        verhaal4 = (TextView) findViewById(R.id.verhaal4);
        verhaal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                veld.setText(R.string.verhaal4);
            }

        });

        //label waar op gedrukt wordt om het lege veld te vullen
        verhaal5 = (TextView) findViewById(R.id.verhaal5);
        verhaal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                veld.setText(R.string.verhaal5);
            }

        });

        //label waar op gedrukt wordt om het lege veld te vullen
        verhaal6 = (TextView) findViewById(R.id.verhaal6);
        verhaal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                veld.setText(R.string.verhaal6);
            }

        });

        //label waar op gedrukt wordt om het lege veld te vullen
        verhaal7 = (TextView) findViewById(R.id.verhaal7);
        verhaal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                veld.setText(R.string.verhaal7);
            }

        });

        //label waar op gedrukt wordt om het lege veld te vullen
        verhaal8 = (TextView) findViewById(R.id.verhaal8);
        verhaal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                veld.setText(R.string.verhaal8);
            }

        });

        //label waar op gedrukt wordt om het lege veld te vullen
        verhaal9 = (TextView) findViewById(R.id.verhaal9);
        verhaal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                veld.setText(R.string.verhaal9);
            }

        });

        //label waar op gedrukt wordt om het lege veld te vullen
        verhaal10 = (TextView) findViewById(R.id.verhaal10);
        verhaal10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                veld.setText(R.string.verhaal10);
            }

        });

        //label waar op gedrukt wordt om het lege veld te vullen
        verhaal11 = (TextView) findViewById(R.id.verhaal11);
        verhaal11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                veld.setText(R.string.verhaal11);
            }

        });

        //label waar op gedrukt wordt om het lege veld te vullen
        verhaal12 = (TextView) findViewById(R.id.verhaal12);
        verhaal12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                veld.setText(R.string.verhaal12);
            }

        });
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
