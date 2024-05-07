package dev.awd.state;

public class CancelledOrderState implements OrderState {
    private OrderManagement orderManagement;

    public CancelledOrderState(OrderManagement orderManagement) {
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
        System.out.println("Cannot Deliver order " + orderManagement.getOrder().getName() + " of state: " + orderManagement.getState());
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order " + orderManagement.getOrder().getName() + "is already cancelled");

    }
}
