package com.vik.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import dagger.internal.DaggerCollections;

public class MainActivity extends AppCompatActivity {

    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CarComponent carComponent = DaggerCarComponent.create();
        car = carComponent.getCar();
        car.drive();


    }
}