package com.example.bjj10.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    TestObject testObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        String initText = "MainActivity Init";
        Log.d("hihi", initText);
        monad(1,5);
    }

    private void monad(Integer... args){
        Log.d("hello", "wow");
    }
}
