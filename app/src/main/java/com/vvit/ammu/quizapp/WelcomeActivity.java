package com.vvit.ammu.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.id_menu_settings :
                startActivity(new Intent(this,SettingsActivity.class));
                break;
            case R.id.id_help :
                startActivity(new Intent(this,HelpActivity.class));
                break;
            case R.id.id_logout :
                finish();
                startActivity(new Intent(this,MainActivity.class));
        }
        return true;
    }


}
