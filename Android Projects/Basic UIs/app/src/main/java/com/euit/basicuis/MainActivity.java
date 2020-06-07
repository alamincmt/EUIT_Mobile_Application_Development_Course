package com.euit.basicuis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.euit.basicuis.utils.PreferenceData;

public class MainActivity extends AppCompatActivity {

    private TextView tv_user_name;
    private TextView tv_logout;

    private PreferenceData preferenceData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.preferenceData = new PreferenceData(MainActivity.this);

        tv_user_name = findViewById(R.id.tv_user_name);
        tv_logout = findViewById(R.id.tv_logout);
        tv_user_name.setText("Welcome "+ preferenceData.getStringValue("username"));

        tv_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferenceData.setValue("username", "");
                preferenceData.setValue("password", "");

                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.menu_about_ap:
                // this is about app menu
                Toast.makeText(MainActivity.this, "Menu About App Pressed. ", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_settings:
                // this is settings menu
                Toast.makeText(MainActivity.this, "Menu Settings Pressed. ", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_logout:
                // this is logout menu

                preferenceData.setValue("username", "");
                preferenceData.setValue("password", "");

                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                Toast.makeText(MainActivity.this, "Log out successfully. ", Toast.LENGTH_LONG).show();
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
