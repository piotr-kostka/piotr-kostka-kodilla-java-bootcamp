package com.kodilla.testing.shape;

class Triangle implements Shape{

    private String shapeName;
    private double a;
    private double h;

    public Triangle(String shapeName, double a, double h) {
        this.shapeName = shapeName;
        this.a = a;
        this.h = h;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        double field = a*h/2;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.a, a) != 0) return false;
        if (Double.compare(triangle.h, h) != 0) return false;
        return shapeName.equals(triangle.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
