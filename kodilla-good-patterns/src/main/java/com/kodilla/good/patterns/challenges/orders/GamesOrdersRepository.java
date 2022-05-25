package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class GamesOrdersRepository implements OrdersRepository{

    @Override
    public boolean createOrder(User user, LocalDateTime orderDate) {
        return true;
    }
}
