package mx.iteso.tables;

import mx.iteso.singleton.*;
import mx.iteso.singleton.tables.Table4;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Table4Test {
    TableOrder order;

    @Before
    public void setUp() {
        order = Table4.getInstance();
    }


    @Test
    public void testTableName() {
        assertEquals("Table 4", order.tableName);
    }

    @Test
    public void testDishes() {
        order.addDish(new Dish());
        order.addDish(new Dish());
        order.addDish(new Dish());
        order.addDish(new Dish());
        assertEquals(4, order.dishes.size());

        order.clearDishes();
        assertEquals(0, order.dishes.size());
    }

    @Test
    public void testDrinks() {
        order.addDrink(new Drink());
        order.addDrink(new Drink());
        assertEquals(2, order.drinks.size());

        order.clearDrinks();
        assertEquals(0, order.drinks.size());
    }
}
