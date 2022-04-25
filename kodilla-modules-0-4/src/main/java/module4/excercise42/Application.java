package module4.excercise42;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Application {

    public static void main (String[] args) {

        Set<Order> orders = new HashSet<>(initOrder());
        OrderProcessor processor = new OrderProcessor(initOrder());
        processor.printValidatedOrders(initOrder());

    }

    public static Set<Order> initOrder() {

        Random random = new Random();
        Set<Order> orders = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            orders.add(new Order(random.nextInt(9000)+1, random.nextInt(3)+2020, random.nextInt(12)+1, random.nextInt(28)+1));
        }
        return orders;
    }
}
