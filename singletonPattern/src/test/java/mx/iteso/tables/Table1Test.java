package mx.iteso.tables;

import mx.iteso.singleton.*;
import mx.iteso.singleton.tables.Table1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Table1Test {
    TableOrder order;

    @Before
    public void setUp() {
        order = Table1.getInstance();
    }


    @Test
    public void testTableName() {
        assertEquals("Table 1", order.tableName);
    }

    @Test
    public void testDishes() {
        order.addDish(new Dish());
        order.addDish(new Dish());
        assertEquals(2, order.dishes.size());

        order.clearDishes();
        assertEquals(0, order.dishes.size());
    }

    @Test
    public void testDrinks() {
        order.addDrink(new Drink());
        order.addDrink(new Drink());
        order.addDrink(new Drink());
        assertEquals(3, order.drinks.size());

        order.clearDrinks();
        assertEquals(0, order.drinks.size());
    }
}
