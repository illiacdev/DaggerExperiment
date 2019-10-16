package com.example.illiac.myapplication.di;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MyModule2 {
    /*@Provides
    static public BB getBB(){
        return new BB();
    }*/
    @Binds
    public abstract IBB getIBB(BB bb);
}
