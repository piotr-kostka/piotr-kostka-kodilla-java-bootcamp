package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> arrivalAirports = new HashMap<>();
        arrivalAirports.put("Warsaw", true);
        arrivalAirports.put("Berlin", true);
        arrivalAirports.put("London", false);

        Boolean arrivalAirportExist = arrivalAirports.get(flight.getArrivalAirport());

        if (arrivalAirportExist == null) {
            throw new RouteNotFoundException();
        } else if (arrivalAirportExist) {
            System.out.println("Direct flight between " + flight.getDepartureAirport() + " and " + flight.getArrivalAirport() + " exists!");
        } else {
            System.out.println("Connecting flight between " + flight.getDepartureAirport() + " and " + flight.getArrivalAirport() + " exists!");
        }
    }
}
