package mx.iteso.enemy.impl;

import mx.iteso.adapter.enemy.impl.EnemyGiantRobot;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EnemyGiantRobotTest {
    public EnemyGiantRobot enemyGiantRobot;

    @Before
    public void setUp() {
        enemyGiantRobot = new EnemyGiantRobot();
    }


    @Test
    public void testSmashWithHands() {
        assertEquals(true, enemyGiantRobot.smashWithHands());
    }

    @Test
    public void testWalkForward() {
        assertEquals(true, enemyGiantRobot.walkForward());
    }

    @Test
    public void testReactToHuman() {
        assertEquals(true, enemyGiantRobot.reactToHuman("Beto"));
    }
}
