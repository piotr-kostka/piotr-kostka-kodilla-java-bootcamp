package com.kodilla.exception.test;

import java.time.LocalTime;

public class FlightRunner {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        try {
            String searchingResult = flightFinder.findFlight(new Flight("Warsaw", "Moscow"));
            System.out.println(searchingResult);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finder used at: " + LocalTime.now());
        }
    }
}
