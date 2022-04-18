package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", new BigDecimal("37900000")));
        europe.addCountry(new Country("Germany", new BigDecimal("83170000")));
        europe.addCountry(new Country("France", new BigDecimal("67290000")));
        europe.addCountry(new Country("Great Britain", new BigDecimal("67080000")));
        europe.addCountry(new Country("Italy", new BigDecimal("59640000")));
        europe.addCountry(new Country("Spain", new BigDecimal("47330000")));
        europe.addCountry(new Country("Portugal", new BigDecimal("10300000")));

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("1413000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("126000000")));
        asia.addCountry(new Country("ZEA", new BigDecimal("9900000")));
        asia.addCountry(new Country("Saudi Arabia", new BigDecimal("35000000")));
        asia.addCountry(new Country("Indonesia", new BigDecimal("270000000")));

        Continent africa = new Continent("Africa");
        africa.addCountry(new Country("Egypt", new BigDecimal("100000000")));
        africa.addCountry(new Country("Nigeria", new BigDecimal("206000000")));
        africa.addCountry(new Country("Cameroon", new BigDecimal("26540000")));
        africa.addCountry(new Country("Kenia", new BigDecimal("53700000")));

        World testee = new World();
        testee.addContinent(europe);
        testee.addContinent(asia);
        testee.addContinent(africa);

        //When
        BigDecimal result = testee.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("2612850000");

        //Then
        assertEquals(expected, result);
    }
}
