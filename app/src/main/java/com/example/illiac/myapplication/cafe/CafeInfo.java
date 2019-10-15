package com.example.illiac.myapplication.cafe;

public class CafeInfo {
    private String name;

    public CafeInfo(){
        System.out.println("카페생성 ");
    }

    public CafeInfo(String name){
        this.name = name;
        System.out.println("카페생성 " + name);
    }

    public void welcome(){
        System.out.println("Welcome " + name == null? "":name );
    }
}
