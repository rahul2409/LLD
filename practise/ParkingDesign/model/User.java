package lld.practise.ParkingDesign.model;

public class User {
    private String name;
    private String email;
    private Vehicle vehicleType;

    public User(String name, String email, Vehicle vehicleType) {
        this.name = name;
        this.email = email;
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Vehicle getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicle vehicleType) {
        this.vehicleType = vehicleType;
    }
}
