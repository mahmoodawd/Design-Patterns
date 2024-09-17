package dev.awd.creational.factory;

public interface PaymentMethod {

    void authorize();

    void startMoneyTransfer();

    void calculatePaymentFees(double amount);
}
