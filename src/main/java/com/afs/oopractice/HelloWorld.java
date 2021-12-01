package com.afs.oopractice;

public class HelloWorld {
    public static void main(String[] args) {
        GasolineEngine gasolineEngine = new GasolineEngine();
        Car gasolineCar = new Car("GasolineCar",gasolineEngine);
        gasolineCar.speedup();

        ElectricEngine electricEngine = new ElectricEngine();
        Car electricCar = new Car("ElectricCar", electricEngine);
        electricCar.speedup();

        Truck truck = new Truck("Truck",10);
        truck.speedup();

        Driver driver = new Driver(gasolineCar);
        driver.driving();
        driver.setVehicleDriving(electricCar);
        driver.driving();
        driver.setVehicleDriving(truck);
        driver.driving();

    }
}
