package com.example.illiac.myapplication.di.component;

import com.example.illiac.myapplication.di.Cafe;
import com.example.illiac.myapplication.di.Main;
import com.example.illiac.myapplication.di.module.CafeModule;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = CafeModule.class)
public interface MainComponent {
    void inject(Main main);
    Cafe obtailAA();
}
