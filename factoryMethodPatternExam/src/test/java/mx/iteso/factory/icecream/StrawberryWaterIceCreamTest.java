package mx.iteso.factory.icecream;

import mx.iteso.factory.IceCream;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StrawberryWaterIceCreamTest {
    private IceCream strawberry;

    @Before
    public void setUp() {
        strawberry = new StrawberryWaterIceCream();
    }

    @Test
    public void testStrawberryWaterIceCream() {
        assertEquals(strawberry.getDescription(), "strawberry water ice cream");
    }
}
