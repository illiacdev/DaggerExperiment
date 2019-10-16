package com.example.illiac.myapplication.di2;

import android.app.Activity;

import com.example.illiac.myapplication.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ModuleMainActivity {
    @Binds
    abstract Activity providesMainActivity(MainActivity activity);

}
