package mx.iteso.factory.icecream;

import mx.iteso.factory.IceCream;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MangoWaterIceCreamTest {
    private IceCream mango;

    @Before
    public void setUp() {
        mango = new MangoWaterIceCream();
    }

    @Test
    public void testMangoWaterIceCream() {
        assertEquals(mango.getDescription(), "mango water ice cream");
    }
}
