package dev.awd.creational.factory;

public class AmericaExpress extends PaymentMethod {
    public AmericaExpress(String cardNumber, String expiryMonth, String expiryYear, String cvv, String cardHolderName) {
        super(cardNumber, expiryMonth, expiryYear, cvv, cardHolderName);
    }

    @Override
    public void authorize() {
        System.out.println("AmericanExpress authorize");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("AmericanExpress startMoneyTransfer");
    }

    @Override
    public void calculatePaymentFees(double amount) {
        System.out.println("AmericanExpress calculatePaymentFees for amount: " + amount);
    }
}
