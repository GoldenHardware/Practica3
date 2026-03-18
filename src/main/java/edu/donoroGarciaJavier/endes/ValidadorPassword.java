package edu.donoroGarciaJavier.endes;

public class ValidadorPassword {

    /**
     * Clase encargada de validar contraseñas.
     */
        /**
         * Valida una contraseña.
         * Reglas:
         * - No nula
         * - Mínimo 8 caracteres
         * - Al menos una mayúscula
         * - Al menos un número
         */
        public boolean validar(String password) {
            if (password == null) {
                return false;
            }

            String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
            return password.matches(regex);
        }
    }

