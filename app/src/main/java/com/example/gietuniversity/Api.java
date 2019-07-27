package com.example.gietuniversity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Api extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);
    }
    public void onBackPressed() {
        Intent a = new Intent(Api.this,MainActivity.class);
        startActivity(a);
        finish();
    }
}
