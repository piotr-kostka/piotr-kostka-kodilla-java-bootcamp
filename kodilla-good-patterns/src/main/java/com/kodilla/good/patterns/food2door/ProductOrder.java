package com.kodilla.good.patterns.food2door;

public class ProductOrder {

    private Product product;
    private int quantity;

    public ProductOrder(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return product +
                ", quantity: " + quantity +
                " pieces";
    }
}
