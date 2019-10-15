package com.example.illiac.myapplication.di2;

import dagger.Component;
import dagger.Subcomponent;

@Subcomponent(modules = ModuleMqttClient.class)
public interface ComponentMqttClient {
    //    public void inject(AppDi2 appDi2);
    public MqttClient getMqttClient();

    @Subcomponent.Builder
    interface  Builder{
        Builder moduleMqttClient(ModuleMqttClient moduleMqttClient);
        ComponentMqttClient build();
    }

}
