package lld.practise.railwayticket;

// com.priceline.ticket.enums
enum Station{
    DELHI (0),
    MATHURA(100),
    AGRA (200),
    GWALIOR (300),
    DEWAS (450),
    INDORE (500);

    private final double distanceFromBaseStation;

    Station (final double distanceFromBaseStation) {
        this.distanceFromBaseStation = distanceFromBaseStation;
    }

    public double getDistanceFromBaseStation() {
        return distanceFromBaseStation;
    }
}

// com.priceline.ticket.calculator
interface TicketPriceCalculator{
    double calculate(final Ticket ticket);
}

abstract class AbstractTicketPriceCalculator implements TicketPriceCalculator {
    protected final double baseFare;
    protected final double baseDistance;
    protected double ticketFarePerKmAfterBaseDistance;

    public AbstractTicketPriceCalculator(final double baseFare, final double baseDistance, final double ticketFarePerKmAfterBaseDistance) {
        this.baseFare = baseFare;
        this.baseDistance = baseDistance;
        this.ticketFarePerKmAfterBaseDistance = ticketFarePerKmAfterBaseDistance;
    }
}

// com.priceline.ticket.calculator.impl
class SingleTicketPriceCalculator extends AbstractTicketPriceCalculator{

    public SingleTicketPriceCalculator(final double baseFare, final double baseDistance, final double ticketFarePerKmAfterBaseDistance) {
        super(baseFare, baseDistance, ticketFarePerKmAfterBaseDistance);
    }

    @Override
    public double calculate(final Ticket ticket) {
        double distance = Math.abs(ticket.endStation().getDistanceFromBaseStation() - ticket.startStation().getDistanceFromBaseStation());
        return baseFare + (distance - baseDistance) * ticketFarePerKmAfterBaseDistance;
    }
}

class ReturnTicketPriceCalculator extends AbstractTicketPriceCalculator {
    private double discount = 0.2;

    public ReturnTicketPriceCalculator(final double baseFare, final double baseDistance,
                                       final double ticketFarePerKmAfterBaseDistance, final double discount) {
        super(baseFare, baseDistance, ticketFarePerKmAfterBaseDistance);
        this.ticketFarePerKmAfterBaseDistance = ticketFarePerKmAfterBaseDistance;
    }

    @Override
    public double calculate(final Ticket ticket) {
        double distance = (Math.abs(ticket.endStation().getDistanceFromBaseStation() - ticket.startStation().getDistanceFromBaseStation())) * 2;
        return (1 - discount) * (baseFare + (distance - baseDistance) * ticketFarePerKmAfterBaseDistance);
    }
}

// com.priceline.ticket.model
record Ticket(Station startStation, Station endStation, boolean isReturn) {
}

class TicketPriceCalculatorManager {

    protected double baseFare = 50;
    protected double baseDistance = 100;
    protected double ticketFarePerKmAfterBaseDistance = 3;
    protected double discount = 0.2;

    private final SingleTicketPriceCalculator singleTicketPriceCalculator;
    private final ReturnTicketPriceCalculator returnTicketPriceCalculator;

    public TicketPriceCalculatorManager() {
        this.singleTicketPriceCalculator = new SingleTicketPriceCalculator(baseFare, baseDistance, ticketFarePerKmAfterBaseDistance);
        this.returnTicketPriceCalculator = new ReturnTicketPriceCalculator(baseFare, baseDistance, ticketFarePerKmAfterBaseDistance, discount);
    }

    public double calculate(Ticket ticket) {
        return ticket.isReturn() ? returnTicketPriceCalculator.calculate(ticket) : singleTicketPriceCalculator.calculate(ticket);
    }
}


public class Main{

    public static void main(String[] args) {
        final TicketPriceCalculatorManager ticketPriceCalculatorManager = new TicketPriceCalculatorManager();

        final Ticket returnTicketFromDelhiToMathura = new Ticket(Station.DELHI, Station.MATHURA, true);
        System.out.println(ticketPriceCalculatorManager.calculate(returnTicketFromDelhiToMathura));

        final Ticket singleTicketFromDelhiToMathura = new Ticket(Station.DELHI, Station.MATHURA, false);
        System.out.println(ticketPriceCalculatorManager.calculate(singleTicketFromDelhiToMathura));
    }

}