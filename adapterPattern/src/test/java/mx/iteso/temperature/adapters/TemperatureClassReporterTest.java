package mx.iteso.temperature.adapters;

import mx.iteso.adapter.temperature.adapters.TemperatureClassReporter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureClassReporterTest {
    TemperatureClassReporter temperatureClassReporter;

    @Before
    public void setUp() {
        temperatureClassReporter = new TemperatureClassReporter();
    }


    @Test
    public void testGetTemperatureInFahrenheit() {
        temperatureClassReporter.setTemperatureInFahrenheit(20);
        assertEquals(20, temperatureClassReporter.getTemperatureInFahrenheit(), 0);
    }

    @Test
    public void testGetTemperatureInCelsius() {
        temperatureClassReporter.setTemperatureInCelsius(20);
        assertEquals(20, temperatureClassReporter.getTemperatureInCelsius(), 0);
    }
}
