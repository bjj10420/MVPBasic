package com.example.bjj10.practice.main;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bjj10.practice.R;
import com.example.bjj10.practice.databinding.ActivityMainBinding;
import com.example.bjj10.practice.util.Util;


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
        initPracticeBtn();
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

    private void initPracticeBtn() {
        Button practiceBtn = findViewById(R.id.activity_practiceBtn);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.activityPracticeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.onClick();
            }
        });
    }

}
