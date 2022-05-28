package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;

    public OrderProcessor(InformationService informationService, OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public OrderDto process(final Order order) {
        boolean isOrdered = orderService.process(order.getUser(), order.getOrderDate(), order.getProduct());

        if (isOrdered) {
            informationService.inform(order.getUser());
            return new OrderDto(order.getUser(), order.getProduct(), true);
        } else {
            return new OrderDto(order.getUser(), order.getProduct(), false);
        }
    }
}
