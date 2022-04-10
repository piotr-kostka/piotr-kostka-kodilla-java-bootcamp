package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Start zestawu testow...");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Testy zostaly zakonczone");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Przeprowadzanie testu nr #" + testCounter);
    }

    @Nested
    @DisplayName("Add and remove tests")
    class AddRemoveTests {
        @Test
        void testAddFigure () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            List<Shape> givenShape = shapeCollector.addFigure(new Triangle(3, 4));

            //When
            List<Shape> retrievedShape = new ArrayList<Shape>();
            retrievedShape.add(new Triangle(3, 4));

            //Then
            Assertions.assertEquals(givenShape, retrievedShape);
        }

        @Test
        void testRemoveFigure () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Triangle(3, 4));

            //When
            boolean result = shapeCollector.removeFigure(new Triangle(3, 4));

            //Then
            Assertions.assertTrue(result);
        }
    }

    @Nested
    @DisplayName("Get and show tests")
    class GetShowTests {
        @Test
        void testGetFigure () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(3, 4);
            shapeCollector.addFigure(new Triangle(3, 4));

            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(triangle, retrievedShape);
        }

        @Test
        void testShowFigures () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Triangle(3, 4));

            //When
            String expected = shapeCollector.showFigures();

            List<Shape> intLIst = Arrays.asList(new Triangle(3, 4));
            String retrievedShape = intLIst.toString();

            //Then
            Assertions.assertEquals(expected, retrievedShape);
        }
    }
}
