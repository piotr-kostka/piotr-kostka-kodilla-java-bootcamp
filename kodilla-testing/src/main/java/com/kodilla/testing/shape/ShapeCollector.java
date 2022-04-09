package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;
    private List<Shape> shapes = new ArrayList<>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public List<Shape> addFigure(Shape shape) {

        Shape triangle = new Triangle(3,4);
        Shape circle = new Circle(5);
        Shape square = new Square(3);
        shapes.add(triangle);
        return shapes;
    }
    public boolean removeFigure(Shape shape) {

        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n) {
        if (n >= 0 && n < shapes.size()) {
            return shapes.get(n);
        }
        return null;
    }
    public String showFigures() {
        return shape.getShapeName();
    }
}
