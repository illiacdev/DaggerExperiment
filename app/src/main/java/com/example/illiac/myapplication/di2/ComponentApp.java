package com.example.illiac.myapplication.di2;

import com.example.illiac.myapplication.MyApp;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class
        , ModuleActivityProvider.class
        , ModuleFragmentProvider.class
//        ,ModuleApp.class
})
public interface ComponentApp extends AndroidInjector<MyApp> {



}
