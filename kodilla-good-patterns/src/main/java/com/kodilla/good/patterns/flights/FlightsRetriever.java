package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsRetriever {

    public static List<Flight> getListOfFlights() {
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warszawa", "Poznan", 5487));
        flightList.add(new Flight("Gdansk", "Katowice", 6523));
        flightList.add(new Flight("Warszawa", "Gdansk", 1276));
        flightList.add(new Flight("Katowice", "Warszawa", 6422));
        flightList.add(new Flight("Warszawa", "Gdansk", 7432));
        flightList.add(new Flight("Katowice", "Poznan", 5432));
        flightList.add(new Flight("Poznan", "Gdansk", 7655));
        flightList.add(new Flight("Wroclaw", "Poznan", 1123));
        flightList.add(new Flight("Warszawa", "Poznan", 6798));
        flightList.add(new Flight("Katowice", "Gdansk", 8765));
        flightList.add(new Flight("Katowice", "Wroclaw", 3576));
        flightList.add(new Flight("Wroclaw", "Warszawa", 2411));

        return new ArrayList<>(flightList);
    }
}
