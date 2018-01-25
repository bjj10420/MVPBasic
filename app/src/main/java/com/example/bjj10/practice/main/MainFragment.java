package com.example.bjj10.practice.main;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.bjj10.practice.R;
import com.example.bjj10.practice.databinding.FragmentMainBinding;

public class MainFragment extends Fragment implements MainContract.MainView {

    private MainContract.Presenter presenter;

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public boolean showToast() {
        Toast.makeText(getContext(), "MVP Test", Toast.LENGTH_LONG).show();
        return false;
    }

    @Override
    public boolean showLog() {
        return false;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentMainBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        View fragmentView = binding.getRoot();
        binding.fragmentPracticeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onClick();
            }
        });
        return fragmentView;
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }

}