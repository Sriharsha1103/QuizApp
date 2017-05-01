package com.vvit.ammu.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String values[] = new String[]{"C","Java","Android","C++","Python","Php"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list = (ListView) findViewById(R.id.id_list_view);

        //String values[] = getResources().getStringArray(R.array.list);

        list.setAdapter(new ArrayAdapter<String>(this,R.layout.list,values));
    }


}
