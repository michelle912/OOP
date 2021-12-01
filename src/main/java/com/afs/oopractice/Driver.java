package com.afs.oopractice;

public class Driver {
    private Vehicle vehicleDriving;

    public Driver(Vehicle vehicleDriving) {
        this.vehicleDriving = vehicleDriving;
    }

    public Vehicle getVehicleDriving() {
        return vehicleDriving;
    }

    public void setVehicleDriving(Vehicle vehicleDriving) {
        this.vehicleDriving = vehicleDriving;
    }

    public void driving() {
        vehicleDriving.speedup();
    }
}
