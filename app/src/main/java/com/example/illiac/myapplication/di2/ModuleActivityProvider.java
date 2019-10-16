package com.example.illiac.myapplication.di2;

import android.app.Activity;

import com.example.illiac.myapplication.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module
public abstract class ModuleActivityProvider {
    /*@Binds
    @IntoMap
    @ClassKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    factory(SubComponent4Activity.Factory factory);*/

    @ContributesAndroidInjector(modules = {ModuleMainActivity.class,ModuleAlertManger.class})
    abstract MainActivity mainActivity();



}
