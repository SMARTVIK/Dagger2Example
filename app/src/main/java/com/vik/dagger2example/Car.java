package com.vik.dagger2example;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Engine engine;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    private Wheels wheels;

    public void drive() {
        Log.d(TAG, "drive: driving");
    }
}
