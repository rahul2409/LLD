package lld.practise.flights.repository;

import lld.practise.flights.model.Ticket;

public class ConnectingFlightPriceCalculator extends AbstractFlightPriceCalculator{

    ConnectingFlightPriceCalculator(double baseFarePerKilometer) {
        super(baseFarePerKilometer);
    }

    @Override
    public double calculate(Ticket ticket) {
        double distance = ticket.getDistanceBetween();
        return distance * baseFarePerKilometer;
    }
}
