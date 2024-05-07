package dev.awd;

import dev.awd.state.Order;
import dev.awd.state.OrderManagement;

public class Main {
    public static void main(String[] args) {
        OrderManagement orderManagement = new OrderManagement(
                new Order("Jacket", 550.50));

        orderManagement.processOrder();
        orderManagement.shipOrder();
        orderManagement.deliverOrder();
        orderManagement.cancelOrder();
    }
}