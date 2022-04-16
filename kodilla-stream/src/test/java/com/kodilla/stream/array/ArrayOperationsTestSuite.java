package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 8;
        numbers[2] = 3;
        numbers[3] = 6;
        numbers[4] = 1;

        //When
        double result = ArrayOperations.getAverage(numbers);
        double expected = 4.6;
        //Then
        Assertions.assertEquals(expected, result);
    }
}
