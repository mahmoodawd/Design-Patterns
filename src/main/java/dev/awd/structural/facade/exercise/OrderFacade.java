package dev.awd.structural.facade.exercise;

public class OrderFacade {
    private InventoryManager inventoryManager;
    private ShippingLogisticsManger shippingLogisticsManger;
    private PaymentProcessor paymentProcessor;


    public OrderFacade() {
        inventoryManager = new InventoryManager();
        shippingLogisticsManger = new ShippingLogisticsManger();
        paymentProcessor = new PaymentProcessor();
    }

    public boolean placeOrder(OrderDetails orderDetails) {
// Check inventory
        if (!inventoryManager.updateInventory(orderDetails.getProductId(), orderDetails.getQuantity())) {
            return false;
        }

        // Process payment
        if (!paymentProcessor.processPayment(orderDetails.getAmount(), orderDetails.getPaymentMethod())) {
            return false;
        }

        // Ship order
        String orderId = orderDetails.getOrderId(); // Assume orderId generation
        String shippingStatus = shippingLogisticsManger.shipOrder(orderId);
        System.out.println("Shipping Status: " + shippingStatus);

        return true;
    }
}
