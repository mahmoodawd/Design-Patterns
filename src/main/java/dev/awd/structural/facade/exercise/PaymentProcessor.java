package dev.awd.structural.facade.exercise;

public class PaymentProcessor {

    public boolean processPayment(double amount, String paymentMethod) {
        System.out.println("pay amount: " + amount + " paymentMethod: " + paymentMethod);
        return true;
    }
}
