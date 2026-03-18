package edu.donoroGarciaJavier.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    void testSumar() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.dividir(10, 0));
    }
}
