package lld.practise.ParkingDesign.service;

import lld.practise.ParkingDesign.model.Parking;
import lld.practise.ParkingDesign.model.ParkingSlot;
import lld.practise.ParkingDesign.model.SlotStatus;
import lld.practise.ParkingDesign.model.Vehicle;
import lld.practise.ParkingDesign.repository.ParkingManager;
import lld.practise.ParkingDesign.repository.ParkingManagerImpl;
import lld.practise.ParkingDesign.repository.ParkingSlotManager;
import lld.practise.ParkingDesign.repository.ParkingSlotManagerImpl;

import java.util.ArrayList;
import java.util.List;

public class ParkingService {
    private ParkingSlotManager parkingSlotManager;
    private ParkingManager parkingManager;

    public ParkingService() {
        this.parkingSlotManager = new ParkingSlotManagerImpl();
        this.parkingManager = new ParkingManagerImpl();
    }

    public ParkingSlot addParkingSlots(String name){
        ParkingSlot parkingSlot = parkingSlotManager.addParkingSlots(name);
        System.out.println("A parking slot with the name: "+ name +" has been added.");
        return parkingSlot;
    }

    public void addParkings(ParkingSlot parkingSlot){
        // Creating random data for testing
        Parking parking = new Parking(Vehicle.CAR, SlotStatus.OPEN, 25.0);
        Parking parking2 = new Parking(Vehicle.CAR, SlotStatus.OCCUPIED, 25.0);
        Parking parking3 = new Parking(Vehicle.CAR, SlotStatus.RESERVED, 25.0);
        Parking parking4 = new Parking(Vehicle.CAR, SlotStatus.OPEN, 25.0);
        Parking parking5 = new Parking(Vehicle.CAR, SlotStatus.OPEN, 25.0);
        List<Parking> parkings = new ArrayList<>();
        parkings.add(parking);
        parkings.add(parking2);
        parkings.add(parking3);
        parkings.add(parking4);
        parkings.add(parking5);
        parkingSlot = parkingSlotManager.addParkings(parkingSlot, parkings);
        System.out.println("Default Parkings have been added.");
    }

    public Parking bookParkingSlot(ParkingSlot parkingSlot, Vehicle vehicle){
        return parkingManager.bookParkingSlot(parkingSlot, vehicle);
    }

    public int getAvailableSlots(ParkingSlot slot,Vehicle vehicle){
        return parkingManager.availableSlots(slot, vehicle);
    }
}
