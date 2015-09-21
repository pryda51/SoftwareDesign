package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import mx.iteso.strategy.behaviors.impl.*;

public class AmericanFootballBallTest {
    @Test
    public void testAmericanFootballBall() {
        AmericanFootballBall americanFootballBall = new AmericanFootballBall();
        americanFootballBall.setBounceBehavior(new IrregularBounce());

        assertEquals("I'm bouncing irregularly!", americanFootballBall.getBounceBehavior());
        assertEquals("I'm deflating!", americanFootballBall.performDeflate());
        assertEquals("I'm inflating!", americanFootballBall.performInflate());
        assertEquals("I'm breaking!", americanFootballBall.performBreak());
        assertEquals("American Football ball is rolling!", americanFootballBall.roll());
    }
}
