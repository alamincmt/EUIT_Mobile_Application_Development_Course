package com.euit.listinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ListDetailsActivity extends AppCompatActivity {

    private TextView tv_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_details);

        tv_details = findViewById(R.id.tv_details);

        if(!getIntent().getStringExtra("selected_language").equals("")){
            tv_details.setText(getIntent().getStringExtra("selected_language"));
        }
    }
}
