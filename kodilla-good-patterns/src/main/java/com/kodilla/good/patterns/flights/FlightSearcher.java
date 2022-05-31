package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {

    public List<Flight> searchByDeparture(String departure) {
        return FlightsRetriever.getListOfFlights().stream()
                .filter(f -> f.getDeparture().equals(departure))
                .collect(Collectors.toList());
    }

    public List<Flight> searchByArrival(String arrival) {
        return FlightsRetriever.getListOfFlights().stream()
                .filter(f -> f.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }

    public List<Flight> searchDirectFlight(String departure, String arrival) {
        return FlightsRetriever.getListOfFlights().stream()
                .filter(f -> f.getDeparture().equals(departure) && f.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }

    public List<Flight> searchFlightWithInterchange(String departure, String arrival) {
        List<Flight> departureAirports = searchByDeparture(departure);
        List<Flight> arrivalAirports = searchByArrival(arrival);

        List<Flight> result = new ArrayList<>();

        for(Flight flight1 : departureAirports) {
            for(Flight flight2 : arrivalAirports) {
                if(flight1.getArrival().equals(flight2.getDeparture())) {
                    result.add(flight1);
                    result.add(flight2);
                }
            }
        }
        return result;
    }
}
