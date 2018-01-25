package com.example.bjj10.practice.test;

import com.example.bjj10.practice.main.MainContract;

public class GeneralPresenter {

    private int a = 1;
    private int b = 2;

    public int sum(){
        int sum = a + b;
        return sum;
    }

    public GeneralPresenter(MainContract.View view) {

    }
}
