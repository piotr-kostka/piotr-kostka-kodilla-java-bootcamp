package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
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
        System.out.println("Sprawdzanie pustej listy");
        //Then
        Assertions.assertTrue(result);
    }

    @DisplayName("when create OddNumbersExterminator with few numbers in list, " + "then result should return only odd numbers")

    @Test
    void testOddNumbersExterminatorNormalList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);

        OddNumbersExterminator exterminator = new OddNumbersExterminator(numbers);
        //When
        List<Integer> result = exterminator.exterminate();

        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);

        System.out.println("Sprawdzanie parzystych liczb");
        //Then
        Assertions.assertEquals(result, expectedResult);
    }
}
