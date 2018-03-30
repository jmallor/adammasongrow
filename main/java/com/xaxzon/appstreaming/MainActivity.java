package com.xaxzon.appstreaming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //On click listener for button1
    public void  missionButton_onClick(View view){
          //take to mission statement page
        Intent intent = new Intent(this, Mission_Activity.class);
        startActivity(intent);


    }
    public void currentButton_onClick (View view){
        //current news and events from Appalachia Streaming
        Intent intent = new Intent(this, Current_Activity.class);
        startActivity(intent);
    }
    public void picButton_onClick(View view){
        //pictures of important events
        Intent intent = new Intent(this, Pics_Activity.class);
        startActivity(intent);
    }
}

