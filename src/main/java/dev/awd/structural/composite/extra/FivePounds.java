package dev.awd.structural.composite.extra;

public class FivePounds implements CurrencyUnit {
    CurrencyUnit directChildUnit;

    public FivePounds() {
        this.directChildUnit = new Pound(5);
    }

    @Override
    public void getFakka() {
        System.out.println("Fakka for 5 Pounds");
        directChildUnit.getFakka();
    }
}
