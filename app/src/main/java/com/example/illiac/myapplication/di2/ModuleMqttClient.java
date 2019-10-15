package com.example.illiac.myapplication.di2;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleMqttClient {
    @Provides
    public MqttClient obtainMqttClient() {
        return new MqttClient();
    }
}
