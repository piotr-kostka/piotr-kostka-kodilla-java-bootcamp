package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double sum = calculator.add(4.0, 2.0);
        double sub = calculator.sub(4.0, 2.0);
        double mul = calculator.mul(3.0,4.0);
        double div = calculator.div(5.0, 2.0);

        //Then
        Assertions.assertEquals(6.0, sum, 0.01);
        Assertions.assertEquals(2.0, sub, 0.01);
        Assertions.assertEquals(12.0, mul, 0.01);
        Assertions.assertEquals(2.5, div, 0.001);
    }
}
