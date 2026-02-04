package edu.donoroGarciaJavier.endes;

public class ConversorTemperatura {

    /**
     * Clase para convertir temperaturas.
     */
    public class ConversorTemperatura {

        /**
         * Convierte Celsius a Fahrenheit.
         */
        public double celsiusAFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        /**
         * Convierte Fahrenheit a Celsius.
         */
        public double fahrenheitACelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
    }

}
