package mx.iteso.enemy;

import mx.iteso.adapter.enemy.EnemyRobot;
import mx.iteso.adapter.enemy.EnemyRobotAdapter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EnemyRobotAdapterTest {
    EnemyRobot enemyRobot;
    EnemyRobotAdapter enemyRobotAdapter;

    @Before
    public void setUp() {
        enemyRobot = mock(EnemyRobot.class);
        enemyRobotAdapter = new EnemyRobotAdapter(enemyRobot);
    }


    @Test
    public void testFireWeapon() {
        assertEquals(true, enemyRobotAdapter.fireWeapon());
    }

    @Test
    public void testDriveForward() {
        assertEquals(true, enemyRobotAdapter.driveForward());
    }

    @Test
    public void testAssignDriver() {
        assertEquals(true, enemyRobotAdapter.assignDriver("Carlos"));
    }
}
