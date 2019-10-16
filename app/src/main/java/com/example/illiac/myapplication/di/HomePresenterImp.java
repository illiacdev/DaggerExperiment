package com.example.illiac.myapplication.di;

import javax.inject.Inject;
import javax.inject.Singleton;

//@PerActivity
//@Singleton
public class HomePresenterImp implements HomePresenter {
    private UserService userService;
    @Inject
    public HomePresenterImp(UserService userService){
        this.userService = userService;
    }
    /*@Override
    public Observable<List<User>> loadUsers(){
        return userService.getUsers();
    }*/
}

