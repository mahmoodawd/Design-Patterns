package dev.awd;

import dev.awd.creational.factory.CardType;
import dev.awd.creational.factory.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.processPayment(CardType.VISA, "Mahmoud", "2513325165", "142", "07", "25", 2500.0);


    }
}
