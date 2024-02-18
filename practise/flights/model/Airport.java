package lld.practise.flights.model;

public enum Airport {
    GOA(0),
    MUMBAI(100),
    AHEMDABAD(200),
    DELHI(300),
    JAMMU(400);

    private final double distanceBetweenAirport;
    Airport(final double distance){
        this.distanceBetweenAirport = distance;
    }
    public double getDistanceBetweenAirport() {
        return distanceBetweenAirport;
    }
}
