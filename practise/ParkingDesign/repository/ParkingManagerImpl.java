package lld.practise.ParkingDesign.repository;

import lld.practise.ParkingDesign.model.Parking;
import lld.practise.ParkingDesign.model.ParkingSlot;
import lld.practise.ParkingDesign.model.SlotStatus;
import lld.practise.ParkingDesign.model.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingManagerImpl implements ParkingManager {

    @Override
    public Map<Vehicle, Integer> availableSlots(ParkingSlot parkingSlot) {
        Map<Vehicle, Integer> slotsAvailable = new HashMap<>();
        for(Parking parking: parkingSlot.getParkings()){
            if(parking.getParkingStatus() == SlotStatus.OPEN){
                if(slotsAvailable.containsKey(parking.getVehicleType())){
                    slotsAvailable.put(parking.getVehicleType(), slotsAvailable.get(parking.getVehicleType()) + 1);
                }
                else {
                    slotsAvailable.put(parking.getVehicleType(),1);
                }
            }
        }
        return slotsAvailable;
    }
    @Override
    public int availableSlots(ParkingSlot parkingSlot, Vehicle vehicle){
        int vehicleOpenSlots = 0;
        Map<Vehicle,Integer> vehicleBasedSlots = availableSlots(parkingSlot);
        if(vehicleBasedSlots.containsKey(vehicle)) vehicleOpenSlots = vehicleBasedSlots.get(vehicle);
        return vehicleOpenSlots;
    }

    @Override
    public Parking bookParkingSlot(ParkingSlot parkingSlot, Vehicle vehicle) {
        Parking parking = null;
        if(availableSlots(parkingSlot, vehicle) > 0){
            // Slots are ready to be alloted for this vehicle
            List<Parking> getAvailableParkingSlots = getParkingListPerVehicle(parkingSlot,vehicle);
            if(getAvailableParkingSlots != null){
                parking = getAvailableParkingSlots.get(0); // allot the first slot
                parking.setParkingStatus(SlotStatus.RESERVED);
            }
        }
        return parking;
    }

    @Override
    public List<Parking> getParkingList(ParkingSlot parkingSlot) {
        // This list will bring all the slots for the all the cars.
        return parkingSlot.getParkings();
    }

    @Override
    public List<Parking> getParkingListPerVehicle(ParkingSlot parkingSlot, Vehicle vehicle) {
        List<Parking> parkings = getParkingList(parkingSlot);
        List<Parking> parkingsAvailableForVehicles = new ArrayList<Parking>();
        for(Parking parking: parkings){
            if(parking.getParkingStatus() == SlotStatus.OPEN && parking.getVehicleType() == vehicle){
                parkingsAvailableForVehicles.add(parking);
            }
        }
        return parkingsAvailableForVehicles;
    }
}
