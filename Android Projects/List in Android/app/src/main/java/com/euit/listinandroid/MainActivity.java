package com.euit.listinandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcv_list;
    private RecyclerView.LayoutManager layoutManager;
    private ProgrammingLanguageAdapter adapter = null;


    private ListView list;
    String[] programmingLanguages = {"C", "C++", "C#", "PHP", "Android"};
    String[] programmingLanguagesDetails = {"C is a mother language of all programming languages. ", "C++ is an Object Oriented Programming Language. ", "C# for Dot net. ", "PHP for web programming.", "Android - We are learning. "};

    private AppCompatSpinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);
        spinner = findViewById(R.id.spinner);

        rcv_list = findViewById(R.id.rcv_list);

        rcv_list.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rcv_list.setLayoutManager(layoutManager);

        adapter = new ProgrammingLanguageAdapter(programmingLanguages, programmingLanguagesDetails, MainActivity.this);
        rcv_list.setAdapter(adapter);


        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, programmingLanguages);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Clicked On - " + programmingLanguages[position], Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ListDetailsActivity.class).putExtra("selected_language", programmingLanguages[position]));
            }
        });


        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Clicked On - " + programmingLanguages[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/

        MyListAdapter adapter = new MyListAdapter(programmingLanguages, programmingLanguagesDetails, MainActivity.this);
        list.setAdapter(adapter);

    }
}
