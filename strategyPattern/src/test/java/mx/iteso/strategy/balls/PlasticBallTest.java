package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import mx.iteso.strategy.behaviors.impl.*;

public class PlasticBallTest {
    @Test
    public void testPlasticBall() {
        PlasticBall plasticBall = new PlasticBall();
        plasticBall.setBounceBehavior(new NormalBounce());

        assertEquals("I'm bouncing normally!", plasticBall.getBounceBehavior());
        assertEquals("I can't deflate!", plasticBall.performDeflate());
        assertEquals("I can't inflate!", plasticBall.performInflate());
        assertEquals("I can't break!", plasticBall.performBreak());
        assertEquals("Plastic ball is rolling!", plasticBall.roll());
    }
}
