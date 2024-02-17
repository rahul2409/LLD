package lld.practise.ParkingDesign.model;

public class Parking {
    private Vehicle vehicleType;
    private SlotStatus parkingStatus;
    private double slotPrice;

    public Parking(Vehicle vehicleType, SlotStatus parkingStatus, double slotPrice) {
        this.vehicleType = vehicleType;
        this.parkingStatus = parkingStatus;
        this.slotPrice = slotPrice;
    }

    public Vehicle getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicle vehicleType) {
        this.vehicleType = vehicleType;
    }

    public SlotStatus getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(SlotStatus parkingStatus) {
        this.parkingStatus = parkingStatus;
    }

    public double getSlotPrice() {
        return slotPrice;
    }

    public void setSlotPrice(double slotPrice) {
        this.slotPrice = slotPrice;
    }
}
