package com.kodilla.exception.test;

import java.time.LocalTime;
import java.util.Optional;

public class FlightRunner {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        try {
            Optional<Flight> searchingResult = flightFinder.findFlight(new Flight("Warsaw", "Moscow"));
            System.out.println(searchingResult);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finder used at: " + LocalTime.now());
        }
    }
}
