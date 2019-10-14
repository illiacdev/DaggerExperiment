package com.example.illiac.myapplication;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton  // Scope
// 연결할 Module을 정의합니다.
@Component(modules = {AndroidSupportInjectionModule.class,
        ActivityBindingModule.class,
        ApplicationModule.class})
// Application과의 연결을 도울 AndroidInjector를 상속받고, 제네릭으로 BaseApplication 클래스를 정의합니다.
public interface AppComponent extends AndroidInjector<BaseApplication> {

    // Application과의 연결을 도울 Builder를 정의합니다.
    @Component.Builder
    interface Builder {
        @BindsInstance
        AppComponent.Builder application(Application application);
        AppComponent build();
    }
}
