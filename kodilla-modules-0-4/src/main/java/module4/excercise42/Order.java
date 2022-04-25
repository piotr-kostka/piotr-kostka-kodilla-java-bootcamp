package module4.excercise42;

import java.time.LocalDate;

public class Order {

    private int orderNo;
    private LocalDate orderDate;

    public Order(int orderNo, int yearOfOrder, int monthOfOrder, int dayOfOrder) {
        this.orderNo = orderNo;
        this.orderDate = LocalDate.of(yearOfOrder, monthOfOrder, dayOfOrder);
    }

    public int getOrderNo() {
        return orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public int hashCode() {
        return orderNo * 37 + orderDate.getYear() * 11 + orderDate.getMonthValue() * 23 + orderDate.getDayOfMonth();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return  orderNo == order.orderNo && (orderDate.getYear() == order.getOrderDate().getYear()) && (orderDate.getMonthValue() == order.getOrderDate().getMonthValue()) && (orderDate.getDayOfMonth() == order.getOrderDate().getDayOfMonth());
    }

    public String toString() {
        return "Zamówienie nr: " + orderNo + " z dnia: " + orderDate;
    }
}
