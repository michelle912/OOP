package com.afs.oopractice;

public class Truck {
    private String name;
    private int speed;

    public Truck(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String speedup() {
        return String.format("Truck: speedup %d km/h", speed);
    }
}
