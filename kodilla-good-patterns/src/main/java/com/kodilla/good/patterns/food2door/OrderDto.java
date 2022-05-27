package com.kodilla.good.patterns.food2door;

public class OrderDto {

    private User user;
    private Shop shop;
    private boolean isOrdered;

    public OrderDto(User user, Shop shop, boolean isOrdered) {
        this.user = user;
        this.shop = shop;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Shop getShop() {
        return shop;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
