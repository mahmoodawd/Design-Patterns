package dev.awd.structural.composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class Bundle implements CartItem {
    private List<CartItem> items;


    public Bundle() {
        items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    @Override
    public double calcTotalPrice() {
        return items.stream().mapToDouble(CartItem::calcTotalPrice).sum();
    }
}
