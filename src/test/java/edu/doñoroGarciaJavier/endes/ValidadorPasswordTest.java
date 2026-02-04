package edu.donoroGarciaJavier.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidadorPasswordTest {

    private final ValidadorPassword validador = new ValidadorPassword();

    @Test
    void passwordValida() {
        assertTrue(validador.validar("Clave123"));
    }

    @Test
    void passwordInvalida() {
        assertFalse(validador.validar("abc"));
    }

    @Test
    void passwordNula() {
        assertFalse(validador.validar(null));
    }
}
