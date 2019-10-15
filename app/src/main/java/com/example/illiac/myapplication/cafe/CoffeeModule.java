package com.example.illiac.myapplication.cafe;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    @CoffeeScope
    @Provides
    CoffeeMaker provideCoffeeMaker(Heater heater){
        return new CoffeeMaker(heater);
    }

    @CoffeeScope
    @Provides
    Heater provideHeater(){
        return new Heater();
    }

    @Provides
    CoffeeBean provideCoffeeBean(){
        return new CoffeeBean();
    }

}
