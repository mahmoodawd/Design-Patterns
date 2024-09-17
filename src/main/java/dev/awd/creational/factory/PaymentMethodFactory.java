package dev.awd.creational.factory;

public interface PaymentMethodFactory {

    PaymentMethod createPaymentMethod(CardType cardType, String cardHolder, String cardNumber, String cvv, String expiryMonth, String expiryYear);
}
