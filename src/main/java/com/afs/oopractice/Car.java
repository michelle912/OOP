package com.afs.oopractice;

public class Car extends Vehicle{
    private Engine engine;

    public Car(String name, Engine engine) {
        super(name, engine.getSpeed());
        this.engine = engine;
    }

    @Override
    public void speedup() {
        System.out.printf("Car: speedup %d km/h%n", engine.getSpeed());
    }
}
