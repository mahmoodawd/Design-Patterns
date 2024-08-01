package dev.awd.structural.flyweight;

public abstract class Enemy implements Player {

    protected String displayName;
    protected int healthBar;
    protected int attackPower;
    protected Weapon weapon;

    protected Enemy(String displayName, int healthBar, int attackPower, Weapon weapon) {
        System.out.println("Creating Enemy");
        this.displayName = displayName;
        this.healthBar = healthBar;
        this.attackPower = attackPower;
        this.weapon = weapon;
    }

    public String displayName() {
        return displayName;
    }

    public int healthBar() {
        return healthBar;
    }

    public int attackPower() {
        return attackPower;
    }

    public Weapon weapon() {
        return weapon;
    }
}