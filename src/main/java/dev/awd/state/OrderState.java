package dev.awd.state;

public interface OrderState {
    void processOrder();

    void shipOrder();

    void deliverOrder();

    void cancelOrder();

}
