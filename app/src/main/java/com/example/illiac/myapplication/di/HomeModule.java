package com.example.illiac.myapplication.di;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class HomeModule {

    /*@Provides
    public HomePresenter providesHomePresenter(){
        return new HomePresenterImp();
    }*/

    @Binds
    public abstract HomePresenter bindHomePresenter(HomePresenterImp
                                                            homePresenterImp);
}

