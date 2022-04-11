package com.kodilla.testing.shape;

class Square implements Shape{

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public String getShapeName() {
        return this.getClass().getSimpleName() + "(" + this.length + ")";
    }

    public double getField() {
        double field = Math.pow(length,2);
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.length, length) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(length);
        return (int) (temp ^ (temp >>> 32));
    }
}
