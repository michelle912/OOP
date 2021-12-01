package com.afs.oopractice;

public class Truck extends Vehicle {
    public Truck(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void speedup() {
        System.out.printf("Truck: speedup %d km/h%n", getSpeed());
    }
}
