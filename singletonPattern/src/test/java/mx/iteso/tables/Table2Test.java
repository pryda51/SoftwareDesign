package mx.iteso.tables;

import mx.iteso.singleton.*;
import mx.iteso.singleton.tables.Table2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Table2Test {
    TableOrder order;

    @Before
    public void setUp() {
        order = Table2.getInstance();
    }


    @Test
    public void testTableName() {
        assertEquals("Table 2", order.tableName);
    }

    @Test
    public void testDishes() {
        order.addDish(new Dish());
        assertEquals(1, order.dishes.size());

        order.clearDishes();
        assertEquals(0, order.dishes.size());
    }

    @Test
    public void testDrinks() {
        order.addDrink(new Drink());
        assertEquals(1, order.drinks.size());

        order.clearDrinks();
        assertEquals(0, order.drinks.size());
    }
}
