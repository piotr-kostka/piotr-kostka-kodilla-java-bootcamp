package com.kodilla.good.patterns.challenges.orders;

public class OrderDto {

    private User user;
    private ProductOrder productOrder;
    private boolean isOrdered;

    public OrderDto(User user, ProductOrder productOrder, boolean isOrdered) {
        this.user = user;
        this.productOrder = productOrder;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
