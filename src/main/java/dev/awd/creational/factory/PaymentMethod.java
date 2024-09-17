package dev.awd.creational.factory;

public abstract class PaymentMethod {
    private String cardNumber;
    private String expiryMonth;
    private String expiryYear;
    private String cvv;
    private String cardHolderName;

    public PaymentMethod(String cardNumber, String expiryMonth, String expiryYear, String cvv, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cvv = cvv;
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryMonth() {
        return expiryMonth;
    }

    public String getExpiryYear() {
        return expiryYear;
    }

    public String getCvv() {
        return cvv;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public abstract void authorize();

    public abstract void startMoneyTransfer();

    public abstract void calculatePaymentFees(double amount);

}
