package com.example.illiac.myapplication.di2;

import com.example.illiac.myapplication.FragmentMain;
import com.example.illiac.myapplication.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ModuleFragmentProvider {
    @ContributesAndroidInjector()
    abstract FragmentMain mainFragment();
}
