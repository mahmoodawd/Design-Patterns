package dev.awd.structural.flyweight;

public class WeakEnemy extends Enemy {

    public WeakEnemy(String displayName, int healthBar, int attackPower, Weapon weapon) {
        super(displayName, healthBar, attackPower, weapon);
    }

    @Override
    public void attack() {
        System.out.println("Weak Enemy : " + displayName + " is attacking " + "with " + weapon.name());
    }

    @Override
    public void assignWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
