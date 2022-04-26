package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FlightFinder {

    public Optional findFlight(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> arrivalAirports = new HashMap<>();
        arrivalAirports.put("Warsaw", true);
        arrivalAirports.put("Berlin", true);
        arrivalAirports.put("London", false);

        if (!arrivalAirports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException(flight + " do not exists!");
        } else if (arrivalAirports.get(flight.getArrivalAirport())) {
            return Optional.of(flight);
        } else {
            return Optional.empty();
        }
    }

}
