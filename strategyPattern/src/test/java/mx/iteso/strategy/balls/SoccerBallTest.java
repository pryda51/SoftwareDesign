package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import mx.iteso.strategy.behaviors.impl.*;

public class SoccerBallTest {
    @Test
    public void testSoccerBall() {
        SoccerBall soccerBall = new SoccerBall();
        soccerBall.setBounceBehavior(new NormalBounce());

        assertEquals("I'm bouncing normally!", soccerBall.getBounceBehavior());
        assertEquals("I'm deflating!", soccerBall.performDeflate());
        assertEquals("I'm inflating!", soccerBall.performInflate());
        assertEquals("I'm breaking!", soccerBall.performBreak());
        assertEquals("Soccer ball is rolling!", soccerBall.roll());
    }
}
