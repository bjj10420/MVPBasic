package com.example.bjj10.practice.test;

import com.example.bjj10.practice.main.MainContract;
import com.example.bjj10.practice.main.MainFragment;

import junit.framework.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneralMainPresenterTest {

    @Test
    public void checkIfSumWork(){
        MainContract.MainView mainView = mock(MainContract.MainView.class);
        GeneralPresenter gp = new GeneralPresenter(mainView);
        Assert.assertEquals(3, gp.sum());
        verify(mainView).showLog();

//        Assert.assertEquals(2, gp.sum());
//        Assert.assertEquals(1, gp.sum());
    }

}