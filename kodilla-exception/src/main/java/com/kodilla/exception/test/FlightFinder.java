package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public Flight findFlight(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> arrivalAirports = new HashMap<>();
        arrivalAirports.put("Warsaw", true);
        arrivalAirports.put("Berlin", true);
        arrivalAirports.put("London", false);

        Boolean arrivalAirportExist = arrivalAirports.get(flight.getArrivalAirport());

        if (arrivalAirportExist == null) {
            throw new RouteNotFoundException();
        } else {
            return flight;
        }
    }
}
