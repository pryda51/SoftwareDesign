package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotDeflatableTest {
    @Test
    public void testNotDeflatableDeflate() {
        NotDeflatable notDeflatable = new NotDeflatable();

        assertEquals("I can't deflate!", notDeflatable.deflate());
    }

    @Test
    public void testNotDeflatableInflate() {
        NotDeflatable notDeflatable = new NotDeflatable();

        assertEquals("I can't inflate!", notDeflatable.inflate());
    }
}
