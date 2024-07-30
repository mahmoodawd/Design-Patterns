package dev.awd.structural.facade;

public class PaymentProcessor {

    public void processPayment(double amount, String paymentMethod) {
        System.out.println("pay amount: " + amount + " paymentMethod: " + paymentMethod);
    }
}
