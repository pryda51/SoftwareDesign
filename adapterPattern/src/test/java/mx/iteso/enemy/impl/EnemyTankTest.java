package mx.iteso.enemy.impl;

import mx.iteso.adapter.enemy.EnemyAttacker;
import mx.iteso.adapter.enemy.impl.EnemyTank;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EnemyTankTest {
    public EnemyAttacker enemyAttacker;

    @Before
    public void setUp() {
        enemyAttacker = new EnemyTank();
    }
    

    @Test
    public void testFireWeapon() {
        assertEquals(true, enemyAttacker.fireWeapon());
    }

    @Test
    public void testDriveForward() {
        assertEquals(true, enemyAttacker.driveForward());
    }

    @Test
    public void testAssignDriver() {
        assertEquals(true, enemyAttacker.assignDriver(""));
    }
}
