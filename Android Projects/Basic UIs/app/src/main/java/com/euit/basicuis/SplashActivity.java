package com.euit.basicuis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.euit.basicuis.utils.PreferenceData;

public class SplashActivity extends Activity {

    private Button btGoToNext;
    private PreferenceData preferenceData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        this.preferenceData = new PreferenceData(SplashActivity.this);

//        getSupportActionBar().setTitle("Splash Screen");


        btGoToNext = findViewById(R.id.btGoToNext);

        btGoToNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SplashActivity.this, "You have clicked gotoNext Button from setOnClickListener(). ", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(!preferenceData.getStringValue("username").equals("")){
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
//                intent.putExtra("message", getString(R.string.welcome_message));
                    startActivity(intent);
                    finish();
                }else{
                    Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
//                intent.putExtra("message", getString(R.string.welcome_message));
                    startActivity(intent);
                    finish();
                }
            }
        }, 2000);
    }

    /*public void gotoNext(View view) {
        Toast.makeText(SplshActivity.this, "You have clicked gotoNext Button. ", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(SplshActivity.this, MainActivity.class);
        startActivity(intent);
    }*/


}
