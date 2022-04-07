package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: rozpoczety...");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: zakonczono sukcesem");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Zestaw testow: rozpoczeto...");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Zestaw testow: zakonczono sukcesem");
    }

    @DisplayName("when create OddNumbersExterminator with empty list, " + "then result should return true")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator(numbers);
        //When
        boolean result = exterminator.exterminate().isEmpty();
        //Then
        Assertions.assertTrue(result);
    }

    @DisplayName("when create OddNumbersExterminator with random numbers in list, " + "then result should return only odd numbers")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        OddNumbersExterminator exterminator = new OddNumbersExterminator(numbers);
        //When
        List<Integer> result = exterminator.exterminate();
        List<Integer> expectedResult = Arrays.asList(2);;
        //Then
        Assertions.assertEquals(result, expectedResult);
    }

    @DisplayName("when create OddNumbersExterminator with odd numbers in list, " + "then result should return all numbers")

    @Test
    void testOddNumbersExterminatorOnlyOddList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        OddNumbersExterminator exterminator = new OddNumbersExterminator(numbers);
        //When
        List<Integer> result = exterminator.exterminate();
        List<Integer> expectedResult = Arrays.asList(2, 4, 6);;
        //Then
        Assertions.assertEquals(result, expectedResult);
    }

    @DisplayName("when create OddNumbersExterminator with even numbers in list, " + "then result should return null")

    @Test
    void testOddNumbersExterminatorOnlyEvenList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        OddNumbersExterminator exterminator = new OddNumbersExterminator(numbers);
        //When
        List<Integer> result = exterminator.exterminate();
        List<Integer> expectedResult = Arrays.asList();;
        //Then
        Assertions.assertEquals(result, expectedResult);
    }
}
