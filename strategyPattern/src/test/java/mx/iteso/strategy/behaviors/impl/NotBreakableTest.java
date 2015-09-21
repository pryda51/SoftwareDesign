package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotBreakableTest {
    @Test
    public void testNotBreakable() {
        NotBreakable notBreakable = new NotBreakable();

        assertEquals("I can't break!", notBreakable.Break());
    }
}
