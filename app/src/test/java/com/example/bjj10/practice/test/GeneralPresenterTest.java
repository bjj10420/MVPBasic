package com.example.bjj10.practice.test;

import junit.framework.Assert;
import org.junit.Test;

public class GeneralPresenterTest {

    @Test
    public void checkIfSumWork(){
        GeneralPresenter gp = new GeneralPresenter();
        Assert.assertEquals(3, gp.sum());
//        Assert.assertEquals(2, gp.sum());
//        Assert.assertEquals(1, gp.sum());
    }
}