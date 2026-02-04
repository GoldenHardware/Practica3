package edu.donoroGarciaJavier.endes;

public class Calculadora {

    /**
     * Clase que realiza operaciones aritméticas básicas.
     */
    public class Calculadora {

        /**
         * Suma dos números.
         */
        public double sumar(double a, double b) {
            return a + b;
        }

        /**
         * Resta dos números.
         */
        public double restar(double a, double b) {
            return a - b;
        }

        /**
         * Multiplica dos números.
         */
        public double multiplicar(double a, double b) {
            return a * b;
        }

        /**
         * Divide dos números.
         * @throws IllegalArgumentException si el divisor es 0
         */
        public double dividir(double a, double b) {
            if (b == 0) {
                throw new IllegalArgumentException("No se puede dividir entre cero");
            }
            return a / b;
        }
    }

}
