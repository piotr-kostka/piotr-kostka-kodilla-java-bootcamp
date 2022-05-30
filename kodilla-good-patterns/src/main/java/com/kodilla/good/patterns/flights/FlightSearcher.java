package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {

    public void searchByDeparture(String departure) {
        System.out.println("Flights from " + departure + ":");
        FlightsRetriever.getListOfFlights().stream()
                .filter(f -> f.getDeparture().equals(departure))
                .map(Flight::toString)
                .forEach(System.out::println);
    }

    public void searchByArrival(String arrival) {
        System.out.println("Flights to " + arrival + ":");
        FlightsRetriever.getListOfFlights().stream()
                .filter(f -> f.getArrival().equals(arrival))
                .map(Flight::toString)
                .forEach(System.out::println);
    }

    public void searchDirectFlight(String departure, String arrival) {
        System.out.println("Direct flights from " +departure + " to " + arrival + ":");
        FlightsRetriever.getListOfFlights().stream()
                .filter(f -> f.getDeparture().equals(departure) && f.getArrival().equals(arrival))
                .map(Flight::toString)
                .forEach(System.out::println);
    }

    public void searchConnectingFlight(String departure, String connectingAirport, String arrival) {
        System.out.println("Connecting flights from " +departure + " to " + arrival + " via " + connectingAirport + ":");

        List<Flight> result = FlightsRetriever.getListOfFlights().stream()
                .filter(f -> f.getDeparture().equals(departure) && f.getArrival().equals(connectingAirport))
                .collect(Collectors.toList());

        result.addAll(FlightsRetriever.getListOfFlights().stream()
                .filter(f -> f.getDeparture().equals(connectingAirport) && f.getArrival().equals(arrival))
                .collect(Collectors.toList()));

        result.stream()
                .forEach(System.out::println);
    }
}
