package com.example.bjj10.practice.test;

import com.example.bjj10.practice.main.MainFragment;

import junit.framework.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneralPresenterTest {

    @Test
    public void checkIfSumWork(){
        MainFragment mf = mock(MainFragment.class);
        GeneralPresenter gp = new GeneralPresenter(mf);
        Assert.assertEquals(3, gp.sum());
//        Assert.assertEquals(2, gp.sum());
//        Assert.assertEquals(1, gp.sum());
    }
}