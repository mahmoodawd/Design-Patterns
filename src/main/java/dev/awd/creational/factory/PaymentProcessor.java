package dev.awd.creational.factory;

public class PaymentProcessor {
    PaymentMethodFactory factory;

    public PaymentProcessor(PaymentMethodFactory factory) {
        this.factory = factory;
    }

    public void processPayment(CardType cardType, String cardHolder, String cardNumber, String cvv, String expiryMonth, String expiryYear, double amount) {
        PaymentMethod paymentMethod = factory.createPaymentMethod(cardType, cardHolder, cardNumber, cvv, expiryMonth, expiryYear);

        paymentMethod.authorize();
        paymentMethod.startMoneyTransfer();
        paymentMethod.calculatePaymentFees(amount);
    }

}
