package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {5, 8, 3, 6, 1};
        //When
        double result = ArrayOperations.getAverage(numbers);
        double expected = 4.6;
        //Then
        assertEquals(expected, result);
    }

    @Test
    void testEmptyTable() {
        //Given
        int[] numbers = {};
        //When
        double result = ArrayOperations.getAverage(numbers);
        double expected = 0;
        //Then
        assertEquals(expected, result);
    }
}
