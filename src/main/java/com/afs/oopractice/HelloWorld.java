package com.afs.oopractice;

public class HelloWorld {
    public static void main(String[] args) {
        Car car = new Car("Car",30);
        System.out.println(car.speedup());

        Truck truck = new Truck("Truck",10);
        System.out.println(truck.speedup());

    }
}
