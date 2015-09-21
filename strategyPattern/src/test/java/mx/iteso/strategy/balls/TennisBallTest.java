package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import mx.iteso.strategy.behaviors.impl.*;

public class TennisBallTest {
    @Test
    public void testTennisBall() {
        TennisBall tennisBall = new TennisBall();
        tennisBall.setBounceBehavior(new NormalBounce());

        assertEquals("I'm bouncing normally!", tennisBall.getBounceBehavior());
        assertEquals("I can't deflate!", tennisBall.performDeflate());
        assertEquals("I can't inflate!", tennisBall.performInflate());
        assertEquals("I can't break!", tennisBall.performBreak());
        assertEquals("Tennis ball is rolling!", tennisBall.roll());
    }
}
