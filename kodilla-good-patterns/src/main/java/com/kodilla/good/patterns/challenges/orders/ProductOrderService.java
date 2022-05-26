package com.kodilla.good.patterns.challenges.orders;

public class ProductOrderService {

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new GamesOrderingService(), new GamesOrdersRepository());
        orderProcessor.process(order);
    }
}
