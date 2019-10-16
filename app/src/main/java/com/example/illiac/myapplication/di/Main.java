package com.example.illiac.myapplication.di;

import javax.inject.Inject;

public class Main {

    public MqttClient client;
//    public HomePresenter presenter;
//    public IAA iaa;
//

//    public IBB ibb;
    @Inject
//    public Main(MqttClient client, HomePresenter presenter) {
//        this.client = client;
//        this.presenter = presenter;
//    }

    public Main(MqttClient client) {
        this.client = client;
    }


    public Main() {
    }
}
