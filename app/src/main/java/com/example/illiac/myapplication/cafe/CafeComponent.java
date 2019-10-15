package com.example.illiac.myapplication.cafe;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        CafeModule.class
})
public interface CafeComponent {
    CafeInfo cafeInfo();
    CoffeeMaker coffeeMaker();
}
