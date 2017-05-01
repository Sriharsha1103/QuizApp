package com.vvit.ammu.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder closeDialog;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         closeDialog = new AlertDialog.Builder(this);

    }

    public void newuser(View v){
        Intent i=new Intent(MainActivity.this,RegisterActivity.class);
        finish();
        startActivity(i);
    }

    public void login(View view) {
        Intent i=new Intent(MainActivity.this,WelcomeActivity.class);
        finish();
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        closeDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                    finish();
            }
        });
        closeDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        closeDialog.setTitle("Close App");
        closeDialog.setMessage("Do You want to close App");
        closeDialog.show();
    }


}
