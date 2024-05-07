package dev.awd.state;

public class NewOrderState implements OrderState {
    private OrderManagement orderManagement;

    public NewOrderState(OrderManagement orderManagement) {
        this.orderManagement = orderManagement;
    }

    @Override
    public void processOrder() {
        System.out.println("Processing New Order... " + orderManagement.getOrder().getName());
        this.orderManagement.setState(new ProcessingOrderState(orderManagement));
    }

    @Override
    public void shipOrder() {
        System.out.println("Cannot ship order " + orderManagement.getOrder().getName() + " of state: " + orderManagement.getState());
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot deliver order " + orderManagement.getOrder().getName() + " of state: " + orderManagement.getState());
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cancelling Order..." + orderManagement.getOrder().getName());
        orderManagement.setState(new CancelledOrderState(orderManagement));
    }
}
