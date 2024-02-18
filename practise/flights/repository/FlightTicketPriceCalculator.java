package lld.practise.flights.repository;

import lld.practise.flights.model.Ticket;

public class FlightTicketPriceCalculator{
    private final double baseFareForConnectingFlight = 20;
    private final double baseFareForDirectFlight = 50;
    private final DirectFlightPriceCalculator directFlightPriceCalculator;
    private final ConnectingFlightPriceCalculator connectingFlightPriceCalculator;
    public FlightTicketPriceCalculator(){
        connectingFlightPriceCalculator = new ConnectingFlightPriceCalculator(baseFareForConnectingFlight);
        directFlightPriceCalculator = new DirectFlightPriceCalculator(baseFareForDirectFlight);
    }
    public double calculate(Ticket ticket) {
        return ticket.isConnecting() ? connectingFlightPriceCalculator.calculate(ticket) : directFlightPriceCalculator.calculate(ticket);
    }
}
