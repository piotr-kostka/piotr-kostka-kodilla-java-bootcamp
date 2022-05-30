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

    public List<Flight> searchFlightWithInterchange(String departure, String arrival, String connectingAirport) {
        List<Flight> flightList = FlightsRetriever.getListOfFlights().stream()
                .filter(f -> f.getDeparture().equals(departure) && f.getArrival().equals(connectingAirport))
                .collect(Collectors.toList());

        flightList.addAll(FlightsRetriever.getListOfFlights().stream()
                .filter(f -> f.getDeparture().equals(connectingAirport) && f.getArrival().equals(arrival))
                .collect(Collectors.toList()));
        return flightList;
    }
}
