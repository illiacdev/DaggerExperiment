package com.example.illiac.myapplication.di;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class MyModule {
    /*@Provides
    String getHost(){
        return "localhost";
    }*/

    @Provides
    MqttClient getMqttClient(){
        return new MqttClient();
    }

//    @Binds
//    public abstract IAA getIAA(AA aa);
//    @Binds
//    public abstract MqttClient mqttClient(MqttClient client);
}
