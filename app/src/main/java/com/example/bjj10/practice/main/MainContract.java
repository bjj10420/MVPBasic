package com.example.bjj10.practice.main;


import com.example.bjj10.practice.inter.BasePresenter;
import com.example.bjj10.practice.inter.BaseView;

public interface MainContract {

    interface View extends BaseView<Presenter> {
        boolean showToast();
    }

    interface Presenter extends BasePresenter {
        void onClick();
   }
}
