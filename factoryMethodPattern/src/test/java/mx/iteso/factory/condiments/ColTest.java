package mx.iteso.factory.condiments;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ColTest {
    private Pozole pozole;

    @Before
    public void setUp() {
        pozole = mock(Pozole.class);
    }

    @Test
    public void testGetDescription() {
        Pozole col = new Col(pozole);
        when(pozole.getDescription()).thenReturn("The test pozole with chicken");

        String description = col.getDescription();
        assertEquals("The test pozole with chicken and cabbage", description);
    }
}
