package com.example.illiac.myapplication.di2;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = ComponentMqttClient.class)
public class ModuleCommunicator {
    @Provides
    public Communicator communicator(){
        return new Communicator();
    }
}
