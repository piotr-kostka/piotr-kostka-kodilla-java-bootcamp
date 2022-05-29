package com.kodilla.good.patterns.flights;

public class Runner {

    public static void main(String[] args) {

        for (Flight flight : FlightSearcher.searchByDeparture("Katowice")) {
            System.out.println(flight);
        }

        for (Flight flight : FlightSearcher.searchDirectFlight("Warszawa", "Gdańsk")) {
            System.out.println(flight);
        }
    }
}
