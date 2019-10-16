package com.example.illiac.myapplication.di;

import dagger.Component;

@Component(modules = {MyModule.class,HomeModule.class,MyModule2.class})
public interface MyComponent {
    MqttClient getMqttClient();
    void inject(Main main);
    Main getMain();
//    IBB makeBB();
//    HomePresenterImp makeHomePresenter();
//    HomePresenter makeHomePresenter();
//    IAA makeIaa();
}
