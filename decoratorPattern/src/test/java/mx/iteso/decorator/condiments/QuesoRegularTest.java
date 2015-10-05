package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class QuesoRegularTest {
    private Taco taco;

    @Before
    public void setUp() {
        taco = mock(Taco.class);
    }


    @Test
    public void testCost() {
        Taco queso = new Queso(taco, Taco.REGULAR);
        when(taco.cost()).thenReturn(8.00);

        double cost = queso.cost();
        assertEquals(10.00, cost, 0.00);
    }

    @Test
    public void testDescription() {
        Taco queso = new Queso(taco, Taco.REGULAR);
        when(taco.getDescription()).thenReturn("Taco normal");

        String desc = queso.getDescription();
        assertEquals("Taco normal con queso", desc);
    }
}
