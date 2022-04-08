package com.kodilla.testing.shape;

class Circle implements Shape{

    private String shapeName;
    private double r;

    public Circle(String shapeName, double r) {
        this.shapeName = shapeName;
        this.r = r;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        double field = Math.PI * Math.pow(r,2);
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.r, r) != 0) return false;
        return shapeName.equals(circle.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
