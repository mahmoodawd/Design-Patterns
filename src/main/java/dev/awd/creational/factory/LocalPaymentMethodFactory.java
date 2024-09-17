package dev.awd.creational.factory;

public class LocalPaymentMethodFactory implements PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod(CardType cardType, String cardHolder, String cardNumber,
                                             String cvv, String expiryMonth, String expiryYear) {
        return switch (cardType) {
            case MEEZA -> new Meeza(cardHolder, cardNumber, cvv, expiryMonth, expiryYear);
            default -> throw new IllegalArgumentException("Invalid card type");
        };
    }
}
