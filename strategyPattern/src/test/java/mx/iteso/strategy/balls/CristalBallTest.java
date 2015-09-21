package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import mx.iteso.strategy.behaviors.impl.*;

public class CristalBallTest {
    @Test
    public void testCristalBall() {
        CristalBall cristalBall = new CristalBall();
        cristalBall.setBounceBehavior(new Crash());

        assertEquals("I crashed!! I can't bounce", cristalBall.getBounceBehavior());
        assertEquals("I can't deflate!", cristalBall.performDeflate());
        assertEquals("I can't inflate!", cristalBall.performInflate());
        assertEquals("I'm breaking!", cristalBall.performBreak());
        assertEquals("Cristal ball is rolling!", cristalBall.roll());
    }
}
