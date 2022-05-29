package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsRetriever {

    public static List<Flight> getListOfFlights() {
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warszawa", "Poznań", 5487));
        flightList.add(new Flight("Gdańsk", "Katowice", 6523));
        flightList.add(new Flight("Warszawa", "Gdańsk", 1276));
        flightList.add(new Flight("Katowice", "Warszawa", 6422));
        flightList.add(new Flight("Warszawa", "Gdańsk", 7432));
        flightList.add(new Flight("Katowice", "Poznań", 5432));
        flightList.add(new Flight("Poznań", "Gdańsk", 7655));
        flightList.add(new Flight("Wrocław", "Poznań", 1123));
        flightList.add(new Flight("Warszawa", "Poznań", 6798));
        flightList.add(new Flight("Katowice", "Gdańsk", 8765));
        flightList.add(new Flight("Katowice", "Wrocław", 3576));
        flightList.add(new Flight("Wrocław", "Warszawa", 2411));

        return new ArrayList<>(flightList);
    }
}
