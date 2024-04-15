package dev.awd.strategy;

public class PaypalPaymentStrategy implements PaymentStrategy {

    @Override
    public void processPayment(double price) {
        System.out.println("Processing payment of Paypal.....");
        System.out.println("Calculating fees of " + price + " Paypal.....");
    }
}
