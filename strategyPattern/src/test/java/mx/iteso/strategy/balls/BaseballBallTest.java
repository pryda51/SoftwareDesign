package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import mx.iteso.strategy.behaviors.impl.*;

public class BaseballBallTest {
    @Test
    public void testBaseballBall() {
        BaseballBall baseballBall = new BaseballBall();
        baseballBall.setBounceBehavior(new IrregularBounce());

        assertEquals("I'm bouncing irregularly!", baseballBall.getBounceBehavior());
        assertEquals("I can't deflate!", baseballBall.performDeflate());
        assertEquals("I can't inflate!", baseballBall.performInflate());
        assertEquals("I'm breaking!", baseballBall.performBreak());
        assertEquals("Baseball ball is rolling!", baseballBall.roll());
    }
}
