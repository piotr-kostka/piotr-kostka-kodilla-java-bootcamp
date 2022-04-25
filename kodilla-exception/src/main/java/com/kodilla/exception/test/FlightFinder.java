package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FlightFinder {

    public String findFlight(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> arrivalAirports = new HashMap<>();
        arrivalAirports.put("Warsaw", true);
        arrivalAirports.put("Berlin", true);
        arrivalAirports.put("London", false);

        Optional<Boolean> arrivalAirportExist = Optional.ofNullable(arrivalAirports.get(flight.getArrivalAirport()));

        if (arrivalAirportExist.isEmpty()) {
            throw new RouteNotFoundException("Flight " + flight + " do not exists!");
        } else {
            if (arrivalAirportExist.get()) {
                return "Direct flight: " + flight;
            } else {
                return "Connecting flight: " + flight;
            }
        }
    }
}
