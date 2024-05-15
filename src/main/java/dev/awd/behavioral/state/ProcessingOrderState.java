package dev.awd.behavioral.state;

public class ProcessingOrderState implements OrderState {
    private final OrderManagement orderManagement;

    public ProcessingOrderState(OrderManagement orderManagement) {
        this.orderManagement = orderManagement;

    }

    @Override
    public void processOrder() {
        System.out.println("Cannot Process order " + orderManagement.getOrder().getName() + " of state: " + orderManagement.getState());

    }

    @Override
    public void shipOrder() {
        System.out.println("Shipping order... " + orderManagement.getOrder().getName());
        orderManagement.setState(new ShippedOrderState(orderManagement));
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot Deliver order " + orderManagement.getOrder().getName() + " of state: " + orderManagement.getState());
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cancelling order... " + orderManagement.getOrder().getName());
        orderManagement.setState(new CancelledOrderState(orderManagement));

    }
}
