package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public List<Shape> addFigure(Shape shape) {
        shapes.add(shape);
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
        String temporary = "";

        for (Shape temp : shapes) {
            if (shapes.indexOf(temp) < shapes.size()-1) {
                temporary += temp.getShapeName() + ", ";
            } else {
               temporary += temp.getShapeName();
            }
        }
        return temporary;
    }
}
