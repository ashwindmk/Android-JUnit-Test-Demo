package com.example.ashwin.junittest;

/**
 * Created by ashwin on 26/8/17.
 */

public class ConverterUtil {

    public static double convertCelsiusToFahrenheit (double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double convertFahrenheitToCelsius (double fahrenheit) {
        return ( (fahrenheit - 32) * 5 ) / 9;
    }

}
