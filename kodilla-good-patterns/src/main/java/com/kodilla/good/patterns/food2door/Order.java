package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class Order {

    private User user;
    private LocalDateTime orderDate;
    private Shop shop;

    public Order(User user, LocalDateTime orderDate, Shop shop) {
        this.user = user;
        this.orderDate = orderDate;
        this.shop = shop;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Shop getShop() {
        return shop;
    }

    @Override
    public String toString() {
        return "Order{user: " + user + "; dateOfOrder: " + orderDate + "; " + shop + '}';
    }
}