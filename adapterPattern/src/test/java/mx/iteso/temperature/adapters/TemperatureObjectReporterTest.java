package mx.iteso.temperature.adapters;

import mx.iteso.adapter.temperature.adapters.TemperatureObjectReporter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureObjectReporterTest {
    TemperatureObjectReporter temperatureObjectReporter;

    @Before
    public void setUp() {
        temperatureObjectReporter = new TemperatureObjectReporter();
    }


    @Test
    public void testGetTemperatureInFahrenheit() {
        temperatureObjectReporter.setTemperatureInFahrenheit(20);
        assertEquals(20, temperatureObjectReporter.getTemperatureInFahrenheit(), 0);
    }

    @Test
    public void testGetTemperatureInCelsius() {
        temperatureObjectReporter.setTemperatureInCelsius(20);
        assertEquals(20, temperatureObjectReporter.getTemperatureInCelsius(), 0);
    }
}
