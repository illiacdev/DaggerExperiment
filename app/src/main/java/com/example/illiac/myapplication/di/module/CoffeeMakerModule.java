package com.example.illiac.myapplication.di.module;

import com.example.illiac.myapplication.di.Cafe;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeMakerModule {
    @Singleton
//    @Reusable
    @Provides
    public Cafe getModule(){
        return new Cafe();
    }




}
