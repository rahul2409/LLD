package lld.practise.ParkingDesign.repository;

import lld.practise.ParkingDesign.model.Parking;
import lld.practise.ParkingDesign.model.ParkingSlot;
import lld.practise.ParkingDesign.model.Vehicle;

import java.util.List;
import java.util.Map;

public interface ParkingManager {
    // find available parking spots
    Map<Vehicle, Integer> availableSlots(ParkingSlot parkingSlot);
    int availableSlots(ParkingSlot parkingSlot, Vehicle vehicle);
    Parking bookParkingSlot(ParkingSlot parkingSlot, Vehicle vehicle);
    List<Parking> getParkingList(ParkingSlot parkingSlot);
    List<Parking> getParkingListPerVehicle(ParkingSlot parkingSlot, Vehicle vehicle);
}
