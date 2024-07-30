package dev.awd.structural.facade.exercise;

public class InventoryManager {

    public boolean updateInventory(String productId, int quantity) {
        System.out.println("Updating inventory for product " + productId + " with quantity " + quantity);
        return true;
    }
}
