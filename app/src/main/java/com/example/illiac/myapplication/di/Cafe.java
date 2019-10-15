package com.example.illiac.myapplication.di;

import javax.inject.Singleton;

@Singleton
public class Cafe {
    public Cafe() {
        System.out.println("생성자 Cafe");
    }

    public void f1(){
        System.out.println("f1");

    }
}
