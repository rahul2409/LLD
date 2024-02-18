package lld.practise.flights.repository;

import lld.practise.flights.model.Ticket;

public interface PriceCalculator {
    double calculate(Ticket ticket);
}
