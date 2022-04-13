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

            //When
            List<Shape> givenShape = shapeCollector.addFigure(new Triangle(3, 4));

            List<Shape> expectedShape = new ArrayList<Shape>();
            expectedShape.add(new Triangle(3, 4));

            //Then
            Assertions.assertEquals(givenShape, expectedShape);
        }

        @Test
        void testRemoveFigure () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(new Triangle(3, 4));
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

            //When
            shapeCollector.addFigure(new Triangle(3, 4));
            Shape retrievedShape = shapeCollector.getFigure(0);

            Triangle triangle = new Triangle(3, 4);

            //Then
            Assertions.assertEquals(retrievedShape, triangle);
        }

        @Test
        void testShowFigures () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(new Triangle(3, 4));
            shapeCollector.addFigure(new Circle(5));
            shapeCollector.addFigure(new Square(4));
            shapeCollector.addFigure(new Circle(10));

            String retrievedShape = shapeCollector.showFigures();
            String expected = "Triangle(3.0,4.0), Circle(5.0), Square(4.0), Circle(10.0)";

            Boolean checkIfEquals = retrievedShape.equals(expected);

            //Then
            Assertions.assertTrue(checkIfEquals);
            Assertions.assertEquals(retrievedShape,expected);
        }
    }
}
