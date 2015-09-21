package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import mx.iteso.strategy.behaviors.impl.*;

public class PingPongBallTest {
    @Test
    public void testPingPongBall() {
        PingPongBall pingPongBall = new PingPongBall();
        pingPongBall.setBounceBehavior(new NormalBounce());

        assertEquals("I'm bouncing normally!", pingPongBall.getBounceBehavior());
        assertEquals("I can't deflate!", pingPongBall.performDeflate());
        assertEquals("I can't inflate!", pingPongBall.performInflate());
        assertEquals("I'm breaking!", pingPongBall.performBreak());
        assertEquals("PingPong ball is rolling!", pingPongBall.roll());
    }
}
