package com.example.illiac.myapplication.di2;

import android.app.Activity;
import android.widget.Toast;

import javax.inject.Inject;

public class AlertManger {
    Activity activity;

    @Inject
    public AlertManger(Activity activity) {
        this.activity = activity;

        Toast.makeText(activity, "테스트", Toast.LENGTH_SHORT).show();
    }
}
