package com.kodilla.good.patterns.flights;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();

        List<Flight> departureFlights = flightSearcher.searchByDeparture("Katowice");
        departureFlights.forEach(System.out::println);

        List<Flight> arrivalFlights = flightSearcher.searchByArrival("Gdansk");
        arrivalFlights.forEach(System.out::println);

        List<Flight> directFlights = flightSearcher.searchDirectFlight("Warszawa", "Gdansk");
        directFlights.forEach(System.out::println);

        List<InterchangeFlight> interchangeFlights =  flightSearcher.searchFlightWithInterchange("Katowice", "Gdansk");
        interchangeFlights.forEach(p -> System.out.println(p.getFirst() + " *** " + p.getSecond()));
    }
}
