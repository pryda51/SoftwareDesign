package mx.iteso;

import mx.iteso.singleton.Dish;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DishTest {
    Dish dish = new Dish();

    @Before
    public void setUp() {
        dish.setName("Pasta al pomodoro");
        dish.setDescription("Plato de spaghetti con salsa roja y ajo");
        dish.setPrice(37.5f);
        dish.setWaiter("Carlos");
    }


    @Test
    public void testDish() {
        assertEquals("Pasta al pomodoro", dish.getName());
        assertEquals("Plato de spaghetti con salsa roja y ajo", dish.getDescription());
        assertEquals(37.5f, dish.getPrice(), 1);
        assertEquals("Carlos", dish.getWaiter());
    }
}
