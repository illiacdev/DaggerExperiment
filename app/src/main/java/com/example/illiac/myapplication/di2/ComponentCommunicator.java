package com.example.illiac.myapplication.di2;

import dagger.Component;

@Component(modules = ModuleCommunicator.class)
public interface ComponentCommunicator {
    public void inject(AppDi2 appDi2);
    public Communicator getCommunicator();

    public ComponentMqttClient.Builder getBuilder();
}
