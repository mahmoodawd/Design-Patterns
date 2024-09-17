package dev.awd;

import dev.awd.creational.factory.CardType;
import dev.awd.creational.factory.LocalPaymentMethodFactory;
import dev.awd.creational.factory.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new LocalPaymentMethodFactory());

        paymentProcessor.processPayment(CardType.MEEZA, "Mahmoud", "2513325165", "142", "07", "25", 2500.0);


    }
}
