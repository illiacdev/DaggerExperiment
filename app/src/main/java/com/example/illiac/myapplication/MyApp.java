package com.example.illiac.myapplication;

import android.app.Activity;
import android.app.Application;

import com.example.illiac.myapplication.di2.ComponentApp;
import com.example.illiac.myapplication.di2.DaggerComponentApp;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;
import dagger.android.support.DaggerApplication;

public class MyApp extends DaggerApplication {
    /*@Inject
    DispatchingAndroidInjector<Object> androidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerComponentApp.create().inject(this);
        System.out.println(androidInjector);
    }

    @Override
    public AndroidInjector<Object> androidInjector() {
        return androidInjector;
    }*/

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerComponentApp.create();
    }
}
