package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class ExtraFoodShop implements OrderService {

    @Override
    public boolean process(User user, LocalDateTime orderDate, Shop shop) {
        return true;
    }
}
