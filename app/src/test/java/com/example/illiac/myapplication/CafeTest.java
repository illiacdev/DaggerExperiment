package com.example.illiac.myapplication;

import com.example.illiac.myapplication.cafe.CafeComponent;
import com.example.illiac.myapplication.cafe.CafeInfo;
import com.example.illiac.myapplication.cafe.CoffeeMaker;
import com.example.illiac.myapplication.cafe.DaggerCafeComponent;

import org.junit.Test;

public class CafeTest {
    @Test
    public void testFunc()
    {
        CafeComponent cafeComponent = DaggerCafeComponent.create();
        CafeInfo cafeInfo1 = cafeComponent.cafeInfo();
        CafeInfo cafeInfo2 = cafeComponent.cafeInfo();

        CoffeeMaker coffeeMaker = cafeComponent.coffeeMaker();
        CoffeeMaker coffeeMaker2 = cafeComponent.coffeeMaker();

    }
}
