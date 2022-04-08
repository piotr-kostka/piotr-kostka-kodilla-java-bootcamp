package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

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

    @Test
    void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle("Trójkąt", 3, 4));

        //When
        shapeCollector.addFigure(new Triangle("Trójkąt", 3, 4));

        //Then
        Assertions.assertEquals(1, shapes.size());
    }

    @Test
    void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle("Trójkąt", 3, 4));

        shapeCollector.addFigure(new Triangle("Trójkąt", 3, 4));

        //When
        boolean result = shapeCollector.removeFigure(new Triangle("Trójkąt", 3, 4));

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapes.size());
    }

    @Test
    void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle("Trójkąt", 3, 4));
        Triangle triangle = new Triangle("Trójkąt", 3, 4);
        shapeCollector.addFigure(triangle);

        //When
        ShapeCollector retrievedFigure;
        retrievedFigure = (ShapeCollector) shapeCollector.getFigure(0);

        //Then
        Assertions.assertEquals(triangle, retrievedFigure);
    }

    @Test
    void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle("Trójkąt", 3, 4));
        Triangle triangle = new Triangle("Trójkąt", 3, 4);
        shapeCollector.addFigure(triangle);

        //When
        ShapeCollector retrievedFigure;
        retrievedFigure = (ShapeCollector) shapeCollector.showFigures();

        //Then
        Assertions.assertEquals(triangle, retrievedFigure);

    }
}
