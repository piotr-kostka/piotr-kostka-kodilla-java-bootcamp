package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class OrderRetriever {

    public Order retrieve() {
        User user = new User("pkej", "Piotr", "Kostka");
        Product product = new Product("Healthy Pasta", 56743, 23.2);
        int quantity = 3;

        LocalDateTime orderDate = LocalDateTime.of(2022, 5, 27, 18,20, 15);

        return new Order(user, orderDate, product, quantity);
    }
}
