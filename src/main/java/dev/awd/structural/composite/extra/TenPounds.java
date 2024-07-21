package dev.awd.structural.composite.extra;

public class TenPounds implements CurrencyUnit {
    CurrencyUnit directChildUnit;

    public TenPounds() {
        this.directChildUnit = new FivePounds();
    }

    @Override
    public void getFakka() {
        System.out.println("Fakka for 10 Pounds");
        directChildUnit.getFakka();
    }
}
