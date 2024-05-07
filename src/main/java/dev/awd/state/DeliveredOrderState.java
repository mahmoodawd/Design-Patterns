package dev.awd.state;

public class DeliveredOrderState implements OrderState {
    private final OrderManagement orderManagement;

    public DeliveredOrderState(OrderManagement orderManagement) {
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
        System.out.println("Order " + orderManagement.getOrder().getName() + "is already Delivered");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cannot Cancel order " + orderManagement.getOrder().getName() + " of state: " + orderManagement.getState());

    }
}
