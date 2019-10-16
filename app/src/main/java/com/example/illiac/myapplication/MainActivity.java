package com.example.illiac.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.illiac.myapplication.di2.AlertManger;

import javax.inject.Inject;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    AlertManger manger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View viewById = findViewById(R.id.place_holder);
        getSupportFragmentManager().beginTransaction().replace(viewById.getId(),new FragmentMain()).commit();

    }


}
