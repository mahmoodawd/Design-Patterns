package dev.awd.creational.factory;

public class Visa extends PaymentMethod {
    public Visa(String cardNumber, String expiryMonth, String expiryYear, String cvv, String cardHolderName) {
        super(cardNumber, expiryMonth, expiryYear, cvv, cardHolderName);
    }

    @Override
    public void authorize() {
        System.out.println("Visa authorize");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("Visa startMoneyTransfer");
    }

    @Override
    public void calculatePaymentFees(double amount) {
        System.out.println("Visa calculatePaymentFees for: " + amount);
    }
}
