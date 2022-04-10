package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    public Map<String, Double> initData() {
        Map<String, Double> temperaturesMap = new HashMap<>();

        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

        return temperaturesMap;
    }

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(initData());

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(initData());

        //When
        double actualAverage = weatherForecast.calculateAverageTemperature();
        double expectedAverage = 25.56;

        //Then
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void testCalculateMedianTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(initData());

        //When
        double actualMedian = weatherForecast.calculateMedianTemperature();
        double expectedMedian = 25.5;

        //Then
        Assertions.assertEquals(expectedMedian, actualMedian);
    }
}
