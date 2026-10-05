package models;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSlot> parkingSlots;

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.parkingSlots = new ArrayList<>();
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void addParkingSlot(ParkingSlot parkingSlot) {
        parkingSlots.add(parkingSlot);
        parkingSlot.setParkingFloor(this);
    }
}
