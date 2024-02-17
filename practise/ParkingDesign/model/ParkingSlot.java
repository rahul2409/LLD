package lld.practise.ParkingDesign.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingSlot {
    private String name;
    private List<Parking> parkings;

    public ParkingSlot(String name) {
        this.name = name;
        this.parkings = new ArrayList<Parking>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Parking> getParkings() {
        return parkings;
    }

    public void setParkings(List<Parking> parkings) {
        this.parkings = parkings;
    }
}
