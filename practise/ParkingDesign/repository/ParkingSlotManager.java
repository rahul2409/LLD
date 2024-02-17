package lld.practise.ParkingDesign.repository;

import lld.practise.ParkingDesign.model.Parking;
import lld.practise.ParkingDesign.model.ParkingSlot;

import java.util.List;

public interface ParkingSlotManager {
    // Add parking slot, add parkings, maintain parkings.
    ParkingSlot addParkingSlots(String name);
    ParkingSlot addParkings(ParkingSlot slot, List<Parking> parking);
}
