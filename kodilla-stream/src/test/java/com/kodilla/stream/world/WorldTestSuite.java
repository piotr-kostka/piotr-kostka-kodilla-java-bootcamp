package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        World testee = new World();

        //When
        BigDecimal result = testee.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("2612850000");

        //Then
        Assertions.assertEquals(expected, result);
    }
}
