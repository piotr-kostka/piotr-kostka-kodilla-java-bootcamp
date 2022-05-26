package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class OrderRetriever {

    public Order retrieve() {
        User user = new User("pkej", "Piotr", "Kostka");
        Product product = new Product("Assassins Creed Valhalla", 23452, 350.00);
        ProductOrder productOrder = new ProductOrder(product, 2);

        LocalDateTime orderDate = LocalDateTime.of(2022, 5, 25, 19, 45);

        return new Order(user, productOrder, orderDate);
    }
}
