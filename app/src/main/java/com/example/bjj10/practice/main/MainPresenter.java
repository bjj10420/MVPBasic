package com.example.bjj10.practice.main;

import android.support.annotation.NonNull;

import static dagger.internal.Preconditions.checkNotNull;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mainView;

    public MainPresenter(@NonNull MainContract.View mainView) {
        this.mainView = checkNotNull(mainView, "tasksView cannot be null!");
        mainView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void onClick() {
        mainView.showToast();
    }
}
