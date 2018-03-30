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

public class Current_Activity extends AppCompatActivity {

    String TextFileURL = "http://www.xaxzon.com/ccustomer.txt" ;
    TextView textView ;
    Button button ;
    URL url ;
    String TextHolder = "" , TextHolder2 = "";
    BufferedReader bufferReader ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_);
        textView = (TextView)findViewById(R.id.textView3);

        button = (Button)findViewById(R.id.currentButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new GetNotePadFileFromServer().execute();

            }
        });
        //textView = (TextView)findViewById(R.id.textView3);
        //TextView txtView = (TextView)findViewById(R.id.txt_view_id);
        //textView.setText(response);

        //set scrollbar
        textView.setMovementMethod(new ScrollingMovementMethod());
    }

    public void mainButton_onClick(View view){
        //return to main screen
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    ///start class here
    public class GetNotePadFileFromServer extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {

            try {
                url = new URL(TextFileURL);

                bufferReader = new BufferedReader(new InputStreamReader(url.openStream()));

                while ((TextHolder2 = bufferReader.readLine()) != null) {

                    TextHolder += TextHolder2 + ('\n');
                }
                bufferReader.close();

            } catch (MalformedURLException malformedURLException) {

                // TODO Auto-generated catch block
                malformedURLException.printStackTrace();
                TextHolder = malformedURLException.toString();

            } catch (IOException iOException) {

                // TODO Auto-generated catch block
                iOException.printStackTrace();

                TextHolder = iOException.toString();
            }

            return null;

        }

        @Override
        protected void onPostExecute(Void finalTextHolder) {

            textView.setText(TextHolder);

            super.onPostExecute(finalTextHolder);
        }

    }

}
