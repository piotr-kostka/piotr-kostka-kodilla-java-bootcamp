package com.kodilla.good.patterns.flights;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();

        flightSearcher.searchByDeparture("Katowice");
        flightSearcher.searchByArrival("Gdansk");
        flightSearcher.searchDirectFlight("Warszawa", "Gdansk");
        List<InterchangeFlight> flights =  flightSearcher.searchFlightWithInterchange("Katowice", "Gdansk");
        flights.forEach(p -> System.out.println(p.getFirst() + " *** " + p.getSecond()));
    }
}
