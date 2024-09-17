package dev.awd.creational.factory;

public class Meeza extends LocalPaymentMethod {
    public Meeza(String cardNumber, String expiryMonth, String expiryYear, String cvv, String cardHolderName) {
        super(cardNumber, expiryMonth, expiryYear, cvv, cardHolderName);
    }

    @Override
    public void authorize() {
        System.out.println("Meeza authorize");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("Meeza startMoneyTransfer");
    }

    @Override
    public void calculatePaymentFees(double amount) {
        System.out.println("Meeza calculatePaymentFees for amount: " + amount);
    }
}
