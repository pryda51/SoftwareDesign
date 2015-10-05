package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TortillaHarinaTest {
    private Taco taco;

    @Before
    public void setUp() {
        taco = mock(Taco.class);
    }


    @Test
    public void testCost() {
        Taco tortillaHarina = new TortillaHarina(taco);
        when(taco.cost()).thenReturn(8.00);

        double cost = tortillaHarina.cost();
        assertEquals(12.00, cost, 0.00);
    }

    @Test
    public void testDescription() {
        Taco tortillaHarina = new TortillaHarina(taco);
        when(taco.getDescription()).thenReturn("Taco normal");

        String desc = tortillaHarina.getDescription();
        assertEquals("Taco normal en tortilla de harina", desc);
    }
}
