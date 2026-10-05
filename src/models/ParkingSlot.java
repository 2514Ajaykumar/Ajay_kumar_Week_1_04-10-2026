package models;

public class ParkingSlot {
    private String slotNumber;
    private Vehicle vehicle;
    private ParkingFloor parkingFloor;

    public ParkingSlot(String slotNumber, ParkingFloor parkingFloor) {
        this.slotNumber = slotNumber;
        this.parkingFloor = parkingFloor;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
