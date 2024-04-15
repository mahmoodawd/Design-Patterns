package dev.awd.strategy;

public class BankPaymentStrategy implements PaymentStrategy {

    @Override
    public void processPayment(double price) {
        System.out.println("Processing payment of Bank.....");
        System.out.println("Calculating fees of " + price + " Bank.....");
    }
}
