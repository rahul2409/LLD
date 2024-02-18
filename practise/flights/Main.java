package lld.practise.flights;

import lld.practise.flights.model.Airport;
import lld.practise.flights.model.Ticket;
import lld.practise.flights.repository.FlightTicketPriceCalculator;
import lld.practise.flights.repository.PriceCalculator;

import java.util.Scanner;

/*
* Create a flight price calculator system. Such that user can enter the source and destination along with seat preference.
* User booking a connecting flight will be charged less compared to user booking a direct flight.
* Assume your plane goes from Goa, Mumbai, Ahemdabad, Delhi, Jammu.
* Connecting flights are applicable after a distance of 100 km.
* Assume each state is 100 km from each other.
* Connecting flight base fare is 20 rs. per km and Direct flight is 50 Rs per km.
* Calculate ticket price.
* */
public class Main {
    public Ticket convertingToConnecting(Ticket ticket){
        System.out.println("converting ticket to connecting ");
        ticket.setConnecting();
        if(ticket.isConnecting()) System.out.println("Conversion successful");
        else System.out.println("Distance between the flights is not more than 100 KM");
        return ticket;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        FlightTicketPriceCalculator flightTicketPriceCalculator = new FlightTicketPriceCalculator();

        // Create a ticket input.
        Ticket ticket = new Ticket(Airport.JAMMU, Airport.GOA);
        System.out.println("Do you want connecting flight? Type yes");
        String connected = sc.next();
        if(connected.equals("yes")) {
            ticket = main.convertingToConnecting(ticket);
        }

        double cost = flightTicketPriceCalculator.calculate(ticket);
        System.out.println("The total fare is " + cost);
    }
}
