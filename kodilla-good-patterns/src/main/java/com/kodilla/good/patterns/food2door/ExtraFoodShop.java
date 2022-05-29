package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements OrderService {

    @Override
    public boolean process(Order order) {
        System.out.println("Thank you for choosing ExtraFoodShop! Free delivery today!");
        System.out.println("Order for: " + getClass().getSimpleName() + " , made by: " + order.getUser() +
                " , date of order: " + order.getOrderDate() + ", order details: " + order.getProduct()
                + ", " + order.getQuantity() + " pieces");
        return true;
    }
}
