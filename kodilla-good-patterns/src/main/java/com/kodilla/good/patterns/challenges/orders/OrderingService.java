package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public interface OrderingService {

    boolean order(User user, LocalDateTime orderDate);
}
