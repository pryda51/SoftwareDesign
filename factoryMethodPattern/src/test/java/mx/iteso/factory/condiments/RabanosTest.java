package mx.iteso.factory.condiments;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class RabanosTest {
    private Pozole pozole;

    @Before
    public void setUp() {
        pozole = mock(Pozole.class);
    }

    @Test
    public void testGetDescription() {
        Pozole rabanos = new Rabanos(pozole);
        when(pozole.getDescription()).thenReturn("The test pozole with chicken");

        String description = rabanos.getDescription();
        assertEquals("The test pozole with chicken and radishes", description);
    }
}
