package dev.awd.structural.flyweight;

import java.util.Objects;

public final class StrongEnemy extends Enemy {
    public StrongEnemy(String displayName, int healthBar, int attackPower, Weapon weapon) {
        super(displayName, healthBar, attackPower, weapon);
    }

    @Override
    public void attack() {
        System.out.println("Strong Enemy: " + displayName + " is attacking " + "with " + weapon.name());

    }

    @Override
    public void assignWeapon(Weapon weapon) {

    }

}
