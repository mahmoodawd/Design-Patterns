package dev.awd.behavioral.state;

public class ShippedOrderState implements OrderState {
    private final OrderManagement orderManagement;

    public ShippedOrderState(OrderManagement orderManagement) {
        this.orderManagement = orderManagement;
    }

    @Override
    public void processOrder() {
        System.out.println("Cannot Process order " + orderManagement.getOrder().getName() + " of state: " + orderManagement.getState());

    }

    @Override
    public void shipOrder() {
        System.out.println("Cannot Ship order " + orderManagement.getOrder().getName() + " of state: " + orderManagement.getState());
    }

    @Override
    public void deliverOrder() {
        System.out.println("Delivering Order.... " + orderManagement.getOrder().getName());
        orderManagement.setState(new DeliveredOrderState(orderManagement));
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cannot Cancel order " + orderManagement.getOrder().getName() + " of state: " + orderManagement.getState());

    }
}
