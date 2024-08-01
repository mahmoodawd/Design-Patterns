package dev.awd.structural.flyweight;

public final class MainPlayer implements Player {
    private final String displayName;
    private final int healthBar;
    private final int attackPower;
    private Weapon weapon;

    public MainPlayer(String displayName, int healthBar, int attackPower, Weapon weapon) {
        System.out.println("Creating Main Player");
        this.displayName = displayName;
        this.healthBar = healthBar;
        this.attackPower = attackPower;
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        System.out.println("Main Player : " + displayName + " is attacking " + "with " + weapon.name());
    }

    @Override
    public void assignWeapon(Weapon weapon) {
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