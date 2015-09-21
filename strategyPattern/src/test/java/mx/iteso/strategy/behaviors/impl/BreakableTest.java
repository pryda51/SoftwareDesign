package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BreakableTest {
    @Test
    public void testBreakable() {
        Breakable breakable = new Breakable();

        assertEquals("I'm breaking!", breakable.Break());
    }
}
