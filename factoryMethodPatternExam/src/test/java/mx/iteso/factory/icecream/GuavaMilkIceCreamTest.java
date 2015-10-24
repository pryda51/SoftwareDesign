package mx.iteso.factory.icecream;

import mx.iteso.factory.IceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuavaMilkIceCreamTest {
    private IceCream guava;

    @Before
    public void setUp() {
        guava = new GuavaMilkIceCream();
    }

    @Test
    public void testGuavaMilkIceCream() {
        assertEquals(guava.getDescription(), "guava milk ice cream");
    }
}