package com.kodilla.good.patterns.food2door;

public class HealthyShop implements OrderService {

    @Override
    public boolean process(Order order) {
        System.out.println("Thank you for choosing HealthyShop! The best quality in this town!");
        System.out.println("Order for: " + getClass().getSimpleName() + " , made by: " + order.getUser() +
                " , date of order: " + order.getOrderDate() + ", order details: " + order.getProduct()
                + ", " + order.getQuantity() + " pieces");
        return true;
    }
}
