package mx.iteso;

import mx.iteso.singleton.Drink;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkTest {
    Drink drink = new Drink();

    @Before
    public void setUp() {
        drink.setName("Soda italiana");
        drink.setDescription("Bebida a base de agua mineral y saborizante");
        drink.setPrice(20.0f);
        drink.setWaiter("Daniel");
    }


    @Test
    public void testDrink() {
        assertEquals("Soda italiana", drink.getName());
        assertEquals("Bebida a base de agua mineral y saborizante", drink.getDescription());
        assertEquals(20.0f, drink.getPrice(), 1);
        assertEquals("Daniel", drink.getWaiter());
    }
}
