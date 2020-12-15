package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape collector test suite")
class ShapeCollectorTestSuite {
    private static int testCount = 0;

    @BeforeAll
    public static void beforeAllTests() { System.out.println("This is the beginning of tests."); }

    @AfterAll
    public static void afterAllTests() { System.out.println("All tests are finished."); }

    @BeforeEach
    public void beforeEveryTest() { testCount++; System.out.println("Preparing to execute test #" + testCount); }
    @Test
    void testAddFigure() {
        // Given
        ShapeCollector collector = new ShapeCollector();
        // When
        collector.addFigure(new Triangle());
        collector.addFigure(new Square());
        collector.addFigure(new Circle());
        // Then
        Assertions.assertEquals(3, collector.getShapesQuantity());
    }
    @Test
    void testRemoveFigure() {
        // Given
        ShapeCollector collector = new ShapeCollector();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();
        collector.addFigure(triangle);
        collector.addFigure(square);
        collector.addFigure(circle);
        // When
        collector.remFigure(square);
        // Then
        Assertions.assertEquals(2, collector.getShapesQuantity());
    }
    @Nested
    @DisplayName("TDD: Nested class just to incorporate a number of tests in it.")
    class InternalClass {
        @Test
        void testGetFigure() {
            ShapeCollector collector = new ShapeCollector();
            Shape shape = new Triangle();
            collector.addFigure(shape);
            // When
            Shape gotShape = collector.getFigure(0);
            // Then
            Assertions.assertEquals(shape, gotShape);
        }
        @Test
        void testShowFigures() {
            ShapeCollector collector = new ShapeCollector();
            // When
            collector.addFigure(new Triangle());
            collector.addFigure(new Square());
            collector.addFigure(new Circle());
            // Then
            System.out.println(collector.showFigures());
        }
    }
}
