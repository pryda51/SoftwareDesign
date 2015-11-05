package mx.iteso.adapter.enemy.impl;

import mx.iteso.adapter.enemy.EnemyRobot;

public class EnemyGiantRobot implements EnemyRobot{

    public boolean smashWithHands() {
        System.out.println("Enemy Robot Causes Damage With Its Hands");
        return true;
    }

    public boolean walkForward() {
        System.out.println("Enemy Robot Walks Forward");
        return true;
    }

    public boolean reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);
        return true;
    }

}
