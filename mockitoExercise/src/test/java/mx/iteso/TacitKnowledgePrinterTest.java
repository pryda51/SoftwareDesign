package mx.iteso;

import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class TacitKnowledgePrinterTest {
    private Printer printer;

    @Before
    public void setUp(){
        printer = mock(Printer.class);
    }

    //Test printNumbers with a limit of 10
        //Verify print() being called 10 times
        //Verify expected result
    @Test
    public void testPrintNumbers10Times() {
        TacitKnowledgePrinter tkp = new TacitKnowledgePrinter(printer);

        tkp.printNumbers(10);
        verify(printer, times(10)).print(anyString());
    }

    //Test printNumbers with a limit of 0
        //Verify Exception
    @Test(expected = RuntimeException.class)
    public void testPrintNumbersLimitZero() {
        TacitKnowledgePrinter tkp = new TacitKnowledgePrinter(printer);

        tkp.printNumbers(0);
    }

    //What else can we test?
        //What should we verify?
    @Test
    public void forbiddenTest() {
        assertTrue(true);
    }

    @Test
    public void DivBy5And3() {
        TacitKnowledgePrinter tkp = new TacitKnowledgePrinter(printer);

        assertEquals(tkp.calculate(15), "TacitKnowledge");
    }

    @Test
    public void DivBy3() {
        TacitKnowledgePrinter tkp = new TacitKnowledgePrinter(printer);

        assertEquals(tkp.calculate(3), "Tacit");
    }

    @Test
    public void DivBy5() {
        TacitKnowledgePrinter tkp = new TacitKnowledgePrinter(printer);

        assertEquals(tkp.calculate(5), "Knowledge");
    }

    @Test
    public void DivNotBy5And3() {
        TacitKnowledgePrinter tkp = new TacitKnowledgePrinter(printer);

        assertEquals(tkp.calculate(2), "2");
    }

}
