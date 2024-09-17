package dev.awd.creational.factory;

public class PaymentMethodFactory {
    private PaymentMethodFactory() {
    }

    public static PaymentMethod createPaymentMethod(CardType cardType, String cardHolder, String cardNumber, String cvv, String expiryMonth, String expiryYear) {
        return switch (cardType) {
            case VISA -> new Visa(cardNumber, expiryMonth, expiryYear, cvv, cardHolder);
            case MASTERCARD -> new MasterCard(cardNumber, expiryMonth, expiryYear, cvv, cardHolder);
            case AMERICAN_EXPRESS -> new AmericaExpress(cardNumber, expiryMonth, expiryYear, cvv, cardHolder);
        };
    }
}
