package com.afs.oopractice;

public class Car {
    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String speedup() {
        return String.format("Car: speedup %d km/h", speed);
    }
}
