package com.task_app.ricardosanchez.task_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    final static String strTag = "RSV";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(strTag,"THIS IS A MESSAGE TO MY LOG - THE ACTIVITY WAS CREATED");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(strTag,"THE APPLICATION STARTED RUNNING. YAY.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(strTag,"THE APPLICATION STOPPED RUNNING. WELP.");
    }

    @Override
    protected void onRestart (){
        super.onRestart();
        Log.d(strTag,"THE APPLICATION RESTARTED. WHAT?");
    }

    public void ShowNewForm (View vwView){
        Log.d(strTag, "OPENING FORM FOR NEW TASK");

        Intent ntnIntent = new Intent(this.getApplicationContext(), NewTaskActivity.class);

        startActivity(ntnIntent);
    }
}
