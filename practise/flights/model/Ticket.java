package lld.practise.flights.model;
//
//public record Ticket(Airport source, Airport destination, boolean isConnecting) {
//}

public class Ticket {
    private Airport source;
    private Airport destination;
    private boolean isConnecting;

    public Ticket(Airport source, Airport destination) {
        this.source = source;
        this.destination = destination;
        this.isConnecting = false;
    }

    public Airport getSource() {
        return source;
    }

    public void setSource(Airport source) {
        this.source = source;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public boolean isConnecting() {
        return isConnecting;
    }

    public boolean setConnecting() {
        // Checking for the condition is connecting
        if(Math.abs(source.getDistanceBetweenAirport() - destination.getDistanceBetweenAirport()) > 100){
            isConnecting = true;
        }
        return isConnecting;
    }

    public double getDistanceBetween(){
        return Math.abs(source.getDistanceBetweenAirport() - destination.getDistanceBetweenAirport());
    }
}
