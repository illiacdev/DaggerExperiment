package com.example.illiac.myapplication.cafe;

import javax.inject.Inject;

public class CoffeeMaker{
    private Heater heater;

    @Inject
    public CoffeeMaker(Heater heater){
        System.out.println("CoffeeMaker 생성");
        this.heater = heater;

    }

    public void brew(CoffeeBean coffeeBean){
        System.out.println("CoffeeBeen("+coffeeBean.toString()+") [_]P coffee! [_]P ");
    }

}
