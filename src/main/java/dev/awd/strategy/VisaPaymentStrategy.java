package dev.awd.strategy;

public class VisaPaymentStrategy implements PaymentStrategy {

    @Override
    public void processPayment(double price) {
        System.out.println("Processing payment of Visa Card.....");
        System.out.println("Calculating fees of " + price + " Visa Card.....");
    }
}
