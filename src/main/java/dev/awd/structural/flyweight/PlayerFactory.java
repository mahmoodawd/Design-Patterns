package dev.awd.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private static final Map<PlayerType, Player> inMemoryCachedPlayers = new HashMap<>();

    private PlayerFactory() {
    }


    public static Player getPlayerOfType(PlayerType type) {
        if (inMemoryCachedPlayers.containsKey(type)) {
            return inMemoryCachedPlayers.get(type);
        }
        Weapon defaultWeapon = new Weapon("AK47", 3);
        Player player;
        switch (type) {
            case MAIN_PLAYER -> player = new MainPlayer("", 0, 0, defaultWeapon);
            case STRONG_ENEMY -> player = new StrongEnemy("", 0, 0, defaultWeapon);
            case WEAK_ENEMY -> player = new WeakEnemy("", 0, 0, defaultWeapon);
            default -> throw new UnsupportedOperationException("UnSupported Player Type");

        }
        inMemoryCachedPlayers.put(type, player);
        return player;

    }
}
