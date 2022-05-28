package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class GlutenFreeShop implements OrderService {

    @Override
    public boolean process(User user, LocalDateTime orderDate, Product product) {
        System.out.println("Thank you for choosing GlutenFreeShop! This week! Special Sale! 30% off!");
        return true;
    }
}
