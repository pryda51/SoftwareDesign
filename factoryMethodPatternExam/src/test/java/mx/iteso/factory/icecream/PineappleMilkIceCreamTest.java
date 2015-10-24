package mx.iteso.factory.icecream;

import mx.iteso.factory.IceCream;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PineappleMilkIceCreamTest {
    private IceCream pineapple;

    @Before
    public void setUp() {
        pineapple = new PineappleMilkIceCream();
    }

    @Test
    public void testPineappleMilkIceCream() {
        assertEquals(pineapple.getDescription(), "pineapple milk ice cream");
    }
}
