package lld.practise.hotelBooking.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private String location;
    private List<Room> associatedRooms;

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
        this.associatedRooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Room> getAssociatedRooms() {
        return associatedRooms;
    }

    public void setAssociatedRooms(List<Room> associatedRooms) {
        this.associatedRooms = associatedRooms;
    }
}
