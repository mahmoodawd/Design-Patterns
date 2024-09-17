package dev.awd.creational.factory;

public abstract class LocalPaymentMethod implements PaymentMethod {

    private final String cardNumber;
    private final String expiryMonth;
    private final String expiryYear;
    private final String cvv;
    private final String cardHolderName;

    public LocalPaymentMethod(String cardNumber, String expiryMonth, String expiryYear, String cvv, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cvv = cvv;
        this.cardHolderName = cardHolderName;
    }

}
