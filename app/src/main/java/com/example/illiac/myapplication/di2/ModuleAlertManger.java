package com.example.illiac.myapplication.di2;

import android.app.Activity;

import com.example.illiac.myapplication.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleAlertManger {
    @Provides
    AlertManger alertManger(Activity activity){
        return new AlertManger(activity);
    }
}
