package com.example.bjj10.practice.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bjj10.practice.R;
import com.example.bjj10.practice.util.Util;

import static dagger.internal.Preconditions.checkNotNull;

public class MainActivity extends AppCompatActivity {

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        MainFragment mainFragment = initMainFragment();
        initMainPresenter(mainFragment);
    }

    private MainFragment initMainFragment() {
        MainFragment MainFragment =
                (MainFragment) getSupportFragmentManager().findFragmentById(R.id.contentLayout);
        if (MainFragment == null) {
            MainFragment = MainFragment.newInstance();
            Util.addFragmentToActivity(
                    getSupportFragmentManager(), MainFragment, R.id.contentLayout);
        }
        return MainFragment;
    }

    private void initMainPresenter(MainFragment mainFragment) {
        mainPresenter = new MainPresenter(mainFragment);
    }

}
