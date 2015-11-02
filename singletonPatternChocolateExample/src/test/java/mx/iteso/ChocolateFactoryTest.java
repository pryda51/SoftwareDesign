package mx.iteso;

import mx.iteso.singleton.ChocolateFactory;
import mx.iteso.singleton.boilers.Boiler1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChocolateFactoryTest {
    public ChocolateFactory factory;


    @Before
    public void setUp() {
        factory = Boiler1.getBoiler1Instance();

        factory.empty = true;
        factory.boiled = false;
    }


    @Test
    public void testFill() {
        factory.fill();

        assertEquals(false, factory.isEmpty());
        assertEquals(false, factory.isBoiled());
    }

    @Test
    public void testDrain() {
        factory.empty = false;
        factory.boiled = true;

        factory.drain();

        assertEquals(true, factory.isEmpty());
    }

    @Test
    public void testBoil() {
        factory.empty = false;
        factory.boiled = false;

        factory.boil();

        assertEquals(true, factory.isBoiled());
    }

    @Test
    public void testIsEmpty() {
        assertEquals(true, factory.isEmpty());
    }

    @Test
    public void testIsBoiled() {
        assertEquals(false, factory.isBoiled());
    }


    public class thread implements Runnable {
        @Override
        public void run() {
            factory = Boiler1.getBoiler1Instance();

            if(factory.isEmpty()) {
                factory.fill();
            } else if(!factory.isBoiled()) {
                factory.boil();
            } else if(factory.isBoiled()) {
                factory.drain();
            }
        }
    }

    @Test
    public void testThread() {
        thread thread1 = new thread();
        thread thread2 = new thread();
        thread thread3 = new thread();

        thread1.run();
        thread2.run();
        thread3.run();

        assertEquals(true, factory.isEmpty());
    }
}
