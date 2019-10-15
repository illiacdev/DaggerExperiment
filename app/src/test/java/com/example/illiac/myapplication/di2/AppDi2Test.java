package com.example.illiac.myapplication.di2;

import com.example.illiac.myapplication.di.component.DaggerSubComponent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppDi2Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testFunc()
    {

        ComponentCommunicator componentCommunicator = DaggerComponentCommunicator.create();

        AppDi2 appDi2 = new AppDi2();

        componentCommunicator.inject(appDi2);

        System.out.println(appDi2.communicator);

//        ComponentMqttClient componentMqttClient = DaggerComponentMqttClient.create();
//        MqttClient mqttClient = componentMqttClient.getMqttClient();
        System.out.println(appDi2.communicator.client);

        Communicator communicator = componentCommunicator.getCommunicator();
        System.out.println(communicator);
        ComponentMqttClient build = componentCommunicator.getBuilder().build();
        MqttClient mqttClient = build.getMqttClient();
        System.out.println(mqttClient);

    }
}