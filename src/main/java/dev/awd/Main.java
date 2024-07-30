package dev.awd;


import dev.awd.structural.facade.exercise.OrderDetails;
import dev.awd.structural.facade.exercise.OrderFacade;

public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        OrderDetails orderDetails = new OrderDetails(
                "A256",
                "DA4582",
                "Mobile Phone",
                25,
                10500.0,
                "Visa"
        );

        orderFacade.placeOrder(orderDetails);

    }
}