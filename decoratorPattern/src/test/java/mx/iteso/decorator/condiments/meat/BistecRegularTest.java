package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BistecRegularTest {
    private Taco taco;

    @Before
    public void setUp() {
        taco = mock(Taco.class);
    }


    @Test
    public void testCost() {
        Taco bistec = new Bistec(taco, Taco.REGULAR);
        when(taco.cost()).thenReturn(8.00);

        double cost = bistec.cost();
        assertEquals(8.00, cost, 0.00);
    }

    @Test
    public void testDescription() {
        Taco bistec = new Bistec(taco, Taco.REGULAR);
        when(taco.getDescription()).thenReturn("Taco normal");

        String desc = bistec.getDescription();
        assertEquals("Taco normal de bistec", desc);
    }
}
