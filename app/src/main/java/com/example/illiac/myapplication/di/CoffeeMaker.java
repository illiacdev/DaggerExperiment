package com.example.illiac.myapplication.di;

import javax.inject.Singleton;

@Singleton
public class CoffeeMaker {
    public CoffeeMaker() {
        System.out.println("생성자 CoffeeMaker");
    }

    public void f1(){
        System.out.println("CoffeeMaker of f1");

    }
}
