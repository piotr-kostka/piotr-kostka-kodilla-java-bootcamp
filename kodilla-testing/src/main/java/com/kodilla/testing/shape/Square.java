package com.kodilla.testing.shape;

class Square implements Shape{

    private String shapeName;
    private double a;

    public Square(String shapeName, double a) {
        this.shapeName = shapeName;
        this.a = a;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        double field = Math.pow(a,2);
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.a, a) != 0) return false;
        return shapeName.equals(square.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
