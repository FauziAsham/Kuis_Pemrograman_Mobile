package com.example.kuispemrogramanmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void backTo(View view) {
        finish();
    }

    public void outApk(View view) {
        MainActivity.outApk(this);
    }
}