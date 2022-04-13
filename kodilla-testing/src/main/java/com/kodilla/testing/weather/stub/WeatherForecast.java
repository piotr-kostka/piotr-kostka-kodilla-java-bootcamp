package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {

        double sum = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        double average = sum / temperatures.getTemperatures().size();

        return average;
    }

    public double calculateMedianTemperature() {

        List<Double> mapValues = new ArrayList<>();
        for (Map.Entry<String, Double> entry : temperatures.getTemperatures().entrySet()) {
            mapValues.add(entry.getValue());
        }
        Collections.sort(mapValues);

        double median = 0;
        if (mapValues.size() % 2 == 0) {
            median = (mapValues.get((mapValues.size()-1)/2) + mapValues.get(mapValues.size()/2)) /2;
        } else {
            median = mapValues.get((mapValues.size()) / 2);
        }
        return median;
    }
}
