package mx.iteso.factory.icecream;

import mx.iteso.factory.IceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuavaWaterIceCreamTest {
    private IceCream guava;

    @Before
    public void setUp() {
        guava = new GuavaWaterIceCream();
    }

    @Test
    public void testGuavaWaterIceCream() {
        assertEquals(guava.getDescription(), "guava water ice cream");
    }
}
