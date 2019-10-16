package com.example.illiac.myapplication;

import com.example.illiac.myapplication.di.DaggerMyComponent;
import com.example.illiac.myapplication.di.Main;
import com.example.illiac.myapplication.di.MqttClient;
import com.example.illiac.myapplication.di.MyComponent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyAppTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFunc() {
//        MqttClient mqttClient = new MqttClient();
//        System.out.println(mqttClient);
        MyComponent component = DaggerMyComponent.create();
        MqttClient mqttClient = component.getMqttClient();
        System.out.println(mqttClient);

        System.out.println(component.getMain().client);

        Main main = new Main();
        component.inject(main);
        System.out.println(main.client);

    }

    @Test
    public void testFunc2() {
        MyComponent component = DaggerMyComponent.create();


//        IAA iaa = component.makeIAA();
//        System.out.println(iaa);

    }
}