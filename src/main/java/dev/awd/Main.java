package dev.awd;


import dev.awd.structural.flyweight.Player;
import dev.awd.structural.flyweight.PlayerFactory;
import dev.awd.structural.flyweight.PlayerType;

public class Main {
    public static void main(String[] args) {

        Player me = PlayerFactory.getPlayerOfType(PlayerType.MAIN_PLAYER);
        Player weakEnemy = PlayerFactory.getPlayerOfType(PlayerType.WEAK_ENEMY);
        Player weakEnemy2 = PlayerFactory.getPlayerOfType(PlayerType.WEAK_ENEMY);
        Player weakEnemy3 = PlayerFactory.getPlayerOfType(PlayerType.WEAK_ENEMY);
        Player strongEnemy = PlayerFactory.getPlayerOfType(PlayerType.STRONG_ENEMY);
        Player strongEnemy2 = PlayerFactory.getPlayerOfType(PlayerType.STRONG_ENEMY);
        Player strongEnemy3 = PlayerFactory.getPlayerOfType(PlayerType.STRONG_ENEMY);

        me.attack();
        weakEnemy.attack();
        strongEnemy.attack();
    }
}