package dev.awd.creational.factory;

public class PaymentProcessor {

    public void processPayment(CardType cardType, String cardHolder, String cardNumber, String cvv, String expiryMonth, String expiryYear, double amount) {
        PaymentMethod paymentMethod = PaymentMethodFactory.createPaymentMethod(cardType, cardHolder, cardNumber, cvv, expiryMonth, expiryYear);

        paymentMethod.authorize();
        paymentMethod.startMoneyTransfer();
        paymentMethod.calculatePaymentFees(amount);
    }

}
