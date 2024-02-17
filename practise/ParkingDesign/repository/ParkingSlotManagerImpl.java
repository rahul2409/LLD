package lld.practise.ParkingDesign.repository;

import lld.practise.ParkingDesign.model.Parking;
import lld.practise.ParkingDesign.model.ParkingSlot;

import java.util.List;

public class ParkingSlotManagerImpl implements ParkingSlotManager{
    @Override
    public ParkingSlot addParkingSlots(String name) {
        ParkingSlot parkingSlot = new ParkingSlot(name);
        return parkingSlot;
    }

    @Override
    public ParkingSlot addParkings(ParkingSlot slot, List<Parking> parking) {
        List<Parking> getExistingParking = slot.getParkings();
        for(Parking sample: parking){
            getExistingParking.add(sample);
        }
        return slot;
    }
}
