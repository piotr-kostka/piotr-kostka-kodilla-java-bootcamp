package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class HealthyShop implements OrderService {

    @Override
    public boolean process(User user, LocalDateTime orderDate, Product product) {
        System.out.println("Thank you for choosing HealthyShop! The best quality in this town!");
        return true;
    }
}
