package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements OrderService {

    @Override
    public boolean process(Order order) {
        System.out.println("Thank you for choosing GlutenFreeShop! This week! Special Sale! 30% off!");
        System.out.println("Order for: " + getClass().getSimpleName() + " , made by: " + order.getUser() +
                " , date of order: " + order.getOrderDate() + ", order details: " + order.getProduct()
                + ", " + order.getQuantity() + " pieces");
        return true;
    }
}
