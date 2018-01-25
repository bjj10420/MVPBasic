package com.example.bjj10.practice.test;

import com.example.bjj10.practice.main.MainContract;

public class GeneralPresenter {

    private final MainContract.MainView mainView;
    private int a = 1;
    private int b = 2;

    public int sum(){
        int sum = a + b;
        mainView.showToast();
        return sum;
    }

    public  GeneralPresenter(MainContract.MainView mainView) {
        this.mainView = mainView;
    }
}
