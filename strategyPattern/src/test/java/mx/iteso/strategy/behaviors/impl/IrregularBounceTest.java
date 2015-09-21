package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IrregularBounceTest {
    @Test
    public void testIrregularBounce() {
        IrregularBounce irregularBounce = new IrregularBounce();

        assertEquals("I'm bouncing irregularly!", irregularBounce.bounce());
    }
}
