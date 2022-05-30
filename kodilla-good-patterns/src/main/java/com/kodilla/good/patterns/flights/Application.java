package com.kodilla.good.patterns.flights;

public class Application {
    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();

        flightSearcher.searchByDeparture("Katowice");
        flightSearcher.searchByArrival("Gdansk");
        flightSearcher.searchDirectFlight("Warszawa", "Gdansk");
        flightSearcher.searchFlightWithInterchange("Katowice", "Gdansk", "Warszawa");
    }
}
