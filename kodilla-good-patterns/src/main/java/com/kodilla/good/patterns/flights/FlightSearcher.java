package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {

    public static List<Flight> searchByDeparture(String departure) {
        return FlightsRetriever.getListOfFlights().stream()
                .filter(f -> f.getDeparture().equals(departure))
                .collect(Collectors.toList());
    }

    public static List<Flight> searchByArrival(String arrival) {
        return FlightsRetriever.getListOfFlights().stream()
                .filter(f -> f.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }

    public static List<Flight> searchDirectFlight(String departure, String arrival) {
        return FlightsRetriever.getListOfFlights().stream()
                .filter(f -> f.getDeparture().equals(departure) && f.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }
}
