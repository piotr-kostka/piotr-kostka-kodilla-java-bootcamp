package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class Order {

    private User user;
    private ProductOrder productOrder;
    private LocalDateTime orderDate;

    public Order(User user, ProductOrder productOrder, LocalDateTime orderDate) {
        this.user = user;
        this.productOrder = productOrder;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
