package services;

import models.ParkingFloor;
import models.ParkingSlot;
import models.Vehicle;

public class ParkingSlotServices {
    //  create list to store parking slots

    private List<ParkingSlot> parkingSlots;

    public ParkingSlotServices() {
        this.parkingSlots = new ArrayList<>();

    }
    // add the 6 parking slots to the list like 2 for bikes and 2 for cars and 2 for trucks
    public void addParkingSlots() {
        parkingSlots.add(new ParkingSlot(1, "Bike", true));
        parkingSlots.add(new ParkingSlot(2, "Bike", true));
        parkingSlots.add(new ParkingSlot(3, "Car", true));
        parkingSlots.add(new ParkingSlot(4, "Car", true));
        parkingSlots.add(new ParkingSlot(5, "Truck", true));
        parkingSlots.add(new ParkingSlot(6, "Truck", true));
    }
    
    




}
