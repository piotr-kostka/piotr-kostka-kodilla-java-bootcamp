package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class Order {

    private User user;
    private LocalDateTime orderDate;
    private Product product;
    private int quantity;

    public Order(User user, LocalDateTime orderDate, Product product, int quantity) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{user: " + user + "; dateOfOrder: " + orderDate + "; " + product + ", " + quantity + " pieces}";
    }
}