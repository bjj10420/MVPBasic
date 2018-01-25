package com.example.bjj10.practice.main;


import com.example.bjj10.practice.inter.BasePresenter;
import com.example.bjj10.practice.inter.BaseView;

public interface MainContract {

    interface MainView extends BaseView<Presenter> {
        boolean showToast();
        boolean showLog();
    }

    interface Presenter extends BasePresenter {
        void onClick();
    }
}
