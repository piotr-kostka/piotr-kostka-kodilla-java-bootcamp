package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class OrderRetriever {

    public Order retrieve() {
        User user = new User("pkej", "Piotr", "Kostka");

        LocalDateTime orderDate = LocalDateTime.of(2022, 5, 25, 19, 45);

        return new Order(user, orderDate);
    }
}
