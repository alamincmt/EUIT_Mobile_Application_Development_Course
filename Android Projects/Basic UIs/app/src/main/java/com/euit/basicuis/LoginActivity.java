package com.euit.basicuis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.euit.basicuis.utils.PreferenceData;

public class LoginActivity extends AppCompatActivity {

    private EditText et_username, et_password;
    private Button btn_login;
    private CheckBox chckbx_remember_me;
    private TextView tv_registration;

    private PreferenceData preferenceData;

    private Boolean remember_me = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        preferenceData = new PreferenceData(LoginActivity.this);

        getSupportActionBar().setTitle("Login");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Initializing the views.
        initViews();

        chckbx_remember_me.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                remember_me = isChecked;
            }
        });

        tv_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et_username.getText().toString().trim();
                String password = et_password.getText().toString().trim();

                if(username != null && !username.equals("")){
                    if(password != null && !password.equals("") && password.length() >= 6){

                        if(remember_me){
                            preferenceData.setValue("username", username);
                            preferenceData.setValue("password", password);
                        }else{
                            preferenceData.setValue("username", "");
                            preferenceData.setValue("password", "");
                        }

                        Toast.makeText(LoginActivity.this, "You have successfully logged in. ", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();

                    }else{
                        Toast.makeText(LoginActivity.this, "Enter your password. ", Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(LoginActivity.this, "Enter your user name. ", Toast.LENGTH_LONG).show();
                }
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void initViews() {
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        chckbx_remember_me = findViewById(R.id.chckbx_remember_me);
        btn_login = findViewById(R.id.btn_login);
        tv_registration = findViewById(R.id.tv_registration);
    }
}
