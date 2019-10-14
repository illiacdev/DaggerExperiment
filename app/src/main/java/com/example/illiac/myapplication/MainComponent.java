package com.example.illiac.myapplication;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;


@Subcomponent(modules = MainModule.class)
public interface MainComponent extends AndroidInjector<MainActivity> {
}
