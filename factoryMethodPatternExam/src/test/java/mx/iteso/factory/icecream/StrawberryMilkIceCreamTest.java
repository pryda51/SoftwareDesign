package mx.iteso.factory.icecream;

import mx.iteso.factory.IceCream;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StrawberryMilkIceCreamTest {
    private IceCream strawberry;

    @Before
    public void setUp() {
        strawberry = new StrawberryMilkIceCream();
    }

    @Test
    public void testStrawberryMilkIceCream() {
        assertEquals(strawberry.getDescription(), "strawberry milk ice cream");
    }
}
