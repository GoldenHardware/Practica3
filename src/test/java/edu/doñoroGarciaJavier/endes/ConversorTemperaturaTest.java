package edu.donoroGarciaJavier.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConversorTemperaturaTest {

    private final ConversorTemperatura conversor = new ConversorTemperatura();

    @Test
    void testCelsiusAFahrenheit() {
        assertEquals(32, conversor.celsiusAFahrenheit(0));
    }

    @Test
    void testFahrenheitACelsius() {
        assertEquals(0, conversor.fahrenheitACelsius(32));
    }
}
