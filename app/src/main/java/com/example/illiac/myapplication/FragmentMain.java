package com.example.illiac.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import dagger.android.AndroidInjector;
import dagger.android.support.DaggerFragment;

public class FragmentMain extends DaggerFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        ViewDataBinding inflate = DataBindingUtil.inflate(inflater, R.layout.fragment_main,
                                                          container, false);

        AndroidInjector<Object> x = androidInjector();
        System.out.println(x);
        return inflate.getRoot();
    }
}
