package dev.awd.behavioral.state;

public class OrderManagement {

    private final Order order;
    private OrderState state;


    public OrderManagement(Order order) {
        this.order = order;
        this.state = new NewOrderState(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public Order getOrder() {
        return order;
    }

    public OrderState getState() {
        return state;
    }

    public void processOrder() {
        state.processOrder();
    }

    public void shipOrder() {
        state.shipOrder();
    }

    public void deliverOrder() {
        state.deliverOrder();

    }

    public void cancelOrder() {
        state.cancelOrder();

    }
}
