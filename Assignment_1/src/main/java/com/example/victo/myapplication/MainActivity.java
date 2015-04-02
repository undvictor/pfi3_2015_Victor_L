package com.example.victo.myapplication;

import android.content.res.Resources;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Button button = (Button) findViewById(R.id.qouteButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        */
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Destroy", "Program forced shut down");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Stop", "Program stopped");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Pause", "Program paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Resume", "Program resumed");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Start", "Program started, yay!");
    }



    public void buttonOnClick(View v){
        //gör nåt

        Random rand = new Random();
        TextView f = (TextView) findViewById(R.id.printView);

        Resources res  = getResources();
        String[] qoutes =  res.getStringArray(R.array.quotes);

        int  n = rand.nextInt(3);
        //String newButtonString = Integer.toString(n);
        String newButtonString = qoutes[n];
                        (f).setText(newButtonString);
        Log.i("MyApp","button pressed!");
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
