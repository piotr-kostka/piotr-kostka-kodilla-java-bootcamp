package com.kodilla.good.patterns.food2door;

public class Product {

    private String name;
    private int ID;
    private double price;

    public Product(String name, int ID, double price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (ID: " + ID +
                "), price: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (ID != product.ID) return false;
        if (Double.compare(product.price, price) != 0) return false;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + ID;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
