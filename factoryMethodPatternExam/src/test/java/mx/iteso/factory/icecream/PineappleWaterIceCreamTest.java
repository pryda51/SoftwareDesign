package mx.iteso.factory.icecream;

import mx.iteso.factory.IceCream;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PineappleWaterIceCreamTest {
    private IceCream pineapple;

    @Before
    public void setUp() {
        pineapple = new PineappleWaterIceCream();
    }

    @Test
    public void testPineappleWaterIceCream() {
        assertEquals(pineapple.getDescription(), "pineapple water ice cream");
    }
}
