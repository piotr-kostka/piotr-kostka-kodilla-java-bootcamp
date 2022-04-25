package module4.excercise42;

import java.util.HashSet;
import java.util.Set;

public class OrderProcessor {

    private Set<Order> orders;
    Set<Order> validatedOrders = new HashSet<>();

    public OrderProcessor(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<Order> validOrders() {

        for (Order order: orders) {
            if (!validatedOrders.contains(order.getOrderNo())) {
                validatedOrders.add(order);
            }
        }
        return validatedOrders;
    }

    public void printValidatedOrders(Set<Order> validatedOrders) {

        for (Order order: validatedOrders) {
            System.out.println(order);
        }
    }
}
