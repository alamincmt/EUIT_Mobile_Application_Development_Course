package com.example.euit_mad_class_002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_header_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate() called");

        tv_header_text = findViewById(R.id.tv_header_text);

        Intent exceptedIntent = getIntent();
        if(exceptedIntent != null){
            String welcome_message = exceptedIntent.getStringExtra("message");
            Log.d("IntentValue", welcome_message);

            tv_header_text.setText(welcome_message);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MainActivity", "onStart() called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("MainActivity", "onRestart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("MainActivity", "onResume() called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("MainActivity", "onStop() called");
    }

    @Override
    protected void onPause() {
        super.onPause();


        Log.d("MainActivity", "onPause() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


        Log.d("MainActivity", "onDestroy() called");
    }
}