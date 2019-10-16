package com.example.illiac.myapplication.di;

import javax.inject.Inject;

import androidx.annotation.NonNull;

public class MqttClient implements IMqttClient {
    /*final public String host;

    @Inject
    public MqttClient(String host) {this.host = host;}*/

    @NonNull
    @Override
    public String toString() {
        return "Mqtt!";
    }
}
