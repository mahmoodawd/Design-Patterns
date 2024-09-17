package dev.awd.creational.factory;

public class MasterCard extends InternationalPaymentMethod {
    public MasterCard(String cardNumber, String expiryMonth, String expiryYear, String cvv, String cardHolderName) {
        super(cardNumber, expiryMonth, expiryYear, cvv, cardHolderName);
    }

    @Override
    public void authorize() {
        System.out.println("MasterCard authorize");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("MasterCard startMoneyTransfer");
    }

    @Override
    public void calculatePaymentFees(double amount) {
        System.out.println("MasterCard calculatePaymentFees for " + amount);
    }
}
