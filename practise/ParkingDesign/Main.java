package lld.practise.ParkingDesign;

/*
* 1. Design a parking lot management system where users can find available parking spots
* , reserve spots, and pay for parking.
* Ensure that the system can handle different types of vehicles and parking durations.

* */

import lld.practise.ParkingDesign.model.Parking;
import lld.practise.ParkingDesign.model.ParkingSlot;
import lld.practise.ParkingDesign.model.User;
import lld.practise.ParkingDesign.model.Vehicle;
import lld.practise.ParkingDesign.service.ParkingService;

public class Main {
    public static void main(String[] args) {
        // Creating a user coming for the system.
        User user = new User("Rahul", "rahulnandrajog99@gmail.com", Vehicle.CAR);
        ParkingService parkingService = new ParkingService();
        ParkingSlot slot = parkingService.addParkingSlots("parkingSlot1");
        parkingService.addParkings(slot);

        // Check the availability of user's vehicle type slot
        System.out.println("The number of vehicles available according to " + user.getName() + " are: " + parkingService.getAvailableSlots(slot, user.getVehicleType()));
        Parking allotedParking = parkingService.bookParkingSlot(slot, user.getVehicleType());
        System.out.println("The alloted parking for Vehicle " + user.getVehicleType() + " is now marked as " + allotedParking.getParkingStatus());
        System.out.println("New available parking size is " + parkingService.getAvailableSlots(slot, user.getVehicleType()));
    }
}
