package controllers;

import models.Bike;
import models.Car;
import models.Truck;
import services.ParkingSlotServices;

public class main {
    public static void main(String[] args) {
        ParkingSlotServices pls = new ParkingSlotServices();

        Bike b1 = new Bike("TS01AS1213", "Bike");
        Bike b2 = new Bike("TS01AS1214", "Bike");
        Bike b3 = new Bike("TS01AS1215", "Bike");

        Car c1 = new Car("TS-03-AA-001", "Car");
        Car c2 = new Car("TS-03-AA-002", "Car");
        Car c3 = new Car("TS-03-AA-003", "Car");

        Truck t1 = new Truck("TS-03-AA-1000", "Truck");
        Truck t2 = new Truck("TS-03-AA-2000", "Truck");
        Truck t3 = new Truck("TS-03-AA-3000", "Truck");

        System.out.println(pls.parkVehicle(b1));
        System.out.println(pls.parkVehicle(c1));
        System.out.println(pls.parkVehicle(t1));
    }
}
