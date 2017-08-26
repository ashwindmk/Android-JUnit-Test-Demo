package com.example.ashwin.junittest;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by ashwin on 26/8/17.
 */

public class ConverterUtilTest {

    @Test
    public void testConvertFahrenheitToCelsius() {
        double actual = ConverterUtil.convertCelsiusToFahrenheit(100);
        // expected value is 212
        double expected = 212;
        // use this method because float is not precise
        assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.001);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        double actual = ConverterUtil.convertFahrenheitToCelsius(212);
        // expected value is 100
        double expected = 100;
        // use this method because float is not precise
        assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.001);
    }

}