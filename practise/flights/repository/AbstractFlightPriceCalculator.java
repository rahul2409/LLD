package lld.practise.flights.repository;

public abstract class AbstractFlightPriceCalculator implements PriceCalculator {
    protected final double baseFarePerKilometer;
    AbstractFlightPriceCalculator(double baseFarePerKilometer){
        this.baseFarePerKilometer = baseFarePerKilometer;
    }
}
