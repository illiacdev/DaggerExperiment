package com.example.illiac.myapplication.cafe;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CafeModule {
    @Singleton
    @Provides
    CafeInfo provideCafeInfo(){
        return new CafeInfo();
    }

    @Provides
    CoffeeMaker provideCoffeeMaker(Heater heater){
        return new CoffeeMaker(heater);
    }

    @Provides
    Heater provideHeater(){
        return new Heater();
    }
}
