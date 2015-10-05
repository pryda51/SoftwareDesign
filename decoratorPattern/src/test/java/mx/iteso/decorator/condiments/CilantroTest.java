package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CilantroTest {
    private Taco taco;

    @Before
    public void setUp() {
        taco = mock(Taco.class);
    }


    @Test
    public void testCost() {
        Taco cilantro = new Cilantro(taco);
        when(taco.cost()).thenReturn(8.00);

        double cost = cilantro.cost();
        assertEquals(8.00, cost, 0.00);
    }

    @Test
    public void testDescription() {
        Taco cilantro = new Cilantro(taco);
        when(taco.getDescription()).thenReturn("Taco normal");

        String desc = cilantro.getDescription();
        assertEquals("Taco normal con cilantro", desc);
    }
}
