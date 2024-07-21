package dev.awd.structural.composite.extra;

public class TwentyPounds implements CurrencyUnit {
    CurrencyUnit directChildUnit;

    public TwentyPounds() {
        this.directChildUnit = new TenPounds();
    }

    @Override
    public void getFakka() {
        System.out.println("Fakka for 20 Pounds");
        directChildUnit.getFakka();
    }
}
