package mx.iteso.adapter.enemy.impl;

import mx.iteso.adapter.enemy.EnemyAttacker;

public class EnemyTank implements EnemyAttacker {

    public boolean fireWeapon() {
        System.out.println("Enemy tank fires weapon");
        return true;
    }

    public boolean driveForward() {
        System.out.println("Enemy Tank moves forward");
        return true;
     }

    public boolean assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
        return true;
    }

}
