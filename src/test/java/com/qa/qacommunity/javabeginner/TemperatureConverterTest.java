package com.qa.qacommunity.javabeginner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest
{
    static TemperatureConverter converter;
    static int fahrenheit;
    static int celsius;
    static int kelvin;
    float actual;
    float expected;

    @BeforeAll
    static void initialiseTestData()
    {
        converter = new TemperatureConverter();
        fahrenheit = 80;
        celsius = 18;
        kelvin = 284;
    }

    @Test
    void convertFahrenheitToCelsius()
    {
        actual = converter.convertFahrenheitToCelsius(fahrenheit);
        expected = converter.convertCelsiusToFahrenheit((int)actual);
        assertEquals(expected, actual);
    }

    @Test
    void convertCelsiusToFahrenheit()
    {
        actual = converter.convertCelsiusToFahrenheit(celsius);
        expected = converter.convertFahrenheitToCelsius((int)actual);
        assertEquals(expected, actual);
    }

    @Test
    void convertKelvinToCelsius()
    {
        actual = converter.convertKelvinToCelsius(kelvin);
        expected = converter.convertCelsiusToKelvin((int)actual);
        assertEquals(expected, actual);
    }

    @Test
    void convertCelsiusToKelvin()
    {
        actual = converter.convertCelsiusToKelvin(celsius);
        expected = converter.convertKelvinToCelsius((int)actual);
        assertEquals(expected, actual);
    }

    @Test
    void convertKelvinToFahrenheit()
    {
        actual = converter.convertKelvinToFahrenheit(kelvin);
        expected = converter.convertFahrenheitToKelvin((int)actual);
        assertEquals(expected, actual);
    }

    @Test
    void convertFahrenheitToKelvin()
    {
        actual = converter.convertFahrenheitToKelvin(fahrenheit);
        expected = converter.convertKelvinToFahrenheit((int)actual);
        assertTrue(actual == expected);
    }
}