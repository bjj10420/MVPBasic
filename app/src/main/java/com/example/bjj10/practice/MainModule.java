package com.example.bjj10.practice;


import dagger.Binds;
import dagger.Module;

@Module
public abstract class MainModule {

    @Binds
    public abstract TestObject bindTestObject(TestObject testObject);
}