package mx.iteso.temperature;

import mx.iteso.adapter.temperature.CelsiusReporter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CelsiusReporterTest {
    CelsiusReporter celsiusReporter;

    @Before
    public void setUp() {
        celsiusReporter = new CelsiusReporter();
    }


    @Test
    public void testTemperatureInCelsius() {
        celsiusReporter.setTemperatureInCelsius(15);
        assertEquals(15, celsiusReporter.getTemperatureInCelsius(), 0);
    }
}
