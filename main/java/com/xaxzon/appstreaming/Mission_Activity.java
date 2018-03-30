package com.xaxzon.appstreaming;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Mission_Activity extends AppCompatActivity {


    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_);

        textView = (TextView)findViewById(R.id.textView2);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }


    public void mainmenuButton_onClick(View view){
        //return to main screen
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
