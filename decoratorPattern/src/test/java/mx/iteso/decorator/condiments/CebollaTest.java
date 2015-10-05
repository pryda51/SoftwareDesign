package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CebollaTest {
    private Taco taco;

    @Before
    public void setUp() {
        taco = mock(Taco.class);
    }


    @Test
    public void testCost() {
        Taco cebolla = new Cebolla(taco);
        when(taco.cost()).thenReturn(8.00);

        double cost = cebolla.cost();
        assertEquals(8.00, cost, 0.00);
    }

    @Test
    public void testDescription() {
        Taco cebolla = new Cebolla(taco);
        when(taco.getDescription()).thenReturn("Taco normal");

        String desc = cebolla.getDescription();
        assertEquals("Taco normal con cebolla", desc);
    }
}
