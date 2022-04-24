package com.kodilla.exception.test;

import java.time.LocalTime;

public class FlightRunner {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("Warsaw", "Moscow"));
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found. Error: " + e);
        } finally {
            System.out.println("Finder used at: " + LocalTime.now());
        }
    }
}
