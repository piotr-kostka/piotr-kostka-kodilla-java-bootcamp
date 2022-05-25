package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class GamesOrdersRepository implements OrdersRepository{

    @Override
    public boolean createOrder(User user, ProductOrder productOrder, LocalDateTime orderDate) {
        return true;
    }
}
