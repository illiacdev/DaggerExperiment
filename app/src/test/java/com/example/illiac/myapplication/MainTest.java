package com.example.illiac.myapplication;

import com.example.illiac.myapplication.di.Main;
import com.example.illiac.myapplication.di.component.DaggerMainComponent;
import com.example.illiac.myapplication.di.component.MainComponent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFunc() {
        Main main = new Main();
        MainComponent build = DaggerMainComponent.builder().build();
        build.inject(main);

        main.cafe.f1();

        build.obtailAA().f1();

    }

    @Test
    public void testFunc4() {

    }
}