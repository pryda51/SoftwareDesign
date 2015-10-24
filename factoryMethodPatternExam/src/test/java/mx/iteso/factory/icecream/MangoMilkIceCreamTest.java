package mx.iteso.factory.icecream;

import mx.iteso.factory.IceCream;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MangoMilkIceCreamTest {
    private IceCream mango;

    @Before
    public void setUp() {
        mango = new MangoMilkIceCream();
    }

    @Test
    public void testMangoMilkIceCream() {
        assertEquals(mango.getDescription(), "mango milk ice cream");
    }
}
