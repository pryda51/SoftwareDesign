package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import mx.iteso.strategy.behaviors.impl.*;

public class GolfBallTest {
    @Test
    public void testGolfBall() {
        GolfBall golfBall = new GolfBall();
        golfBall.setBounceBehavior(new IrregularBounce());

        assertEquals("I'm bouncing irregularly!", golfBall.getBounceBehavior());
        assertEquals("I can't deflate!", golfBall.performDeflate());
        assertEquals("I can't inflate!", golfBall.performInflate());
        assertEquals("I can't break!", golfBall.performBreak());
        assertEquals("Golf ball is rolling!", golfBall.roll());
    }
}
