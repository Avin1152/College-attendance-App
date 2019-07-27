package com.example.gietuniversity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);


    }
    public void onBackPressed() {
        Intent a = new Intent(Developer.this,MainActivity.class);
        startActivity(a);
        finish();
    }
}
