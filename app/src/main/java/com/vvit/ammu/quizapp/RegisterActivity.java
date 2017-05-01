package com.vvit.ammu.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    Spinner course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        course= (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> obj= ArrayAdapter.createFromResource(this,R.array.list,android.R.layout.simple_spinner_item);
        course.setAdapter(obj);

        course.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String msg =" You have selected "+course.getSelectedItem().toString();
                Toast.makeText(RegisterActivity.this,msg,Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void register(View view) {
        finish();
        startActivity(new Intent(this,MainActivity.class));
    }
}
