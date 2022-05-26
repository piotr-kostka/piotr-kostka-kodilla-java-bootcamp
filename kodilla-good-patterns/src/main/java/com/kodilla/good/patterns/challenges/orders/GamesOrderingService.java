package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class GamesOrderingService implements OrderingService{

    @Override
    public boolean order(User user, ProductOrder productOrder, LocalDateTime orderDate) {
        return true;
    }
}
