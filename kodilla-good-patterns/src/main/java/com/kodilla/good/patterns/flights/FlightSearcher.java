package com.kodilla.good.patterns.flights;

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

    public List<InterchangeFlight> searchFlightWithInterchange(String departure, String arrival) {
        List<Flight> departureAirports = searchByDeparture(departure);
        List<Flight> arrivalAirports = searchByArrival(arrival);

        return departureAirports.stream()
                .flatMap(f -> arrivalAirports.stream().filter(g -> g.getDeparture().equals(f.getArrival())).map(g -> new InterchangeFlight(f, g)))
                .collect(Collectors.toList());
    }
}

