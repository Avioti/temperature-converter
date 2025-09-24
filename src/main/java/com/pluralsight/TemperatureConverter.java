package com.pluralsight;

import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner Enter_celsius = new Scanner(System.in);
        System.out.println("Enter a Celsius temperature: ");
        double celsius = Enter_celsius.nextDouble();
        Scanner Enter_fahrenheit = new Scanner(System.in);
        System.out.println("Enter a Fahrenheit temperature: ");
        double fahrenheit = Enter_fahrenheit.nextDouble();
        Scanner Enter_kelvin = new Scanner(System.in);
        System.out.println("Enter a Kelvin temperature: ");
        double kelvin = Enter_kelvin.nextDouble();
        double Converted_celsius = (celsius * 9 / 5) + 32;
        double Converted_fahrenheit = (fahrenheit - 32) * 5 / 9;
        double Celsus_to_kelvin = celsius + 273.15;
        double Kelvin_to_celsius = kelvin - 273.15;


        System.out.println("Starting Celsius Temp: " + celsius);
        System.out.println( "Celsius to Fahrenheit " + Math.round(Converted_celsius) + "F" + " rounded");
        System.out.println("Celsius to Fahrenheit " + Math.round(Converted_celsius * 10.0) / 10.0 + "F" + " one decimal");
        System.out.println("Celsius to Fahrenheit " + Math.round(Converted_celsius * 100.0) / 100.0 + "F" + " two decimal");
        System.out.println("Celsius to Kelvin " + Math.round(Celsus_to_kelvin * 10.0) / 10.0 + "K" + " one decimal");
        System.out.println("Celsius to Kelvin " + Math.round(Celsus_to_kelvin * 100.0) / 100.0 + "K" + " two decimal");

        System.out.println("Starting Fahrenheit Temp: " + fahrenheit);
        System.out.println("Fahrenheit to Celsius " + Math.round(Converted_fahrenheit) + "C" + " rounded");
        System.out.println("Fahrenheit to Celsius " + Math.round(Converted_fahrenheit * 10.0) / 10.0 + "C" + " one decimal");
        System.out.println("Fahrenheit to Celsius " + Math.round(Converted_fahrenheit * 100.0) / 100.0 + "C" + " two decimal");

        System.out.println("Starting Kelvin Temp: " + kelvin);
        System.out.println("Kelvin to Celsius " + Math.round(Kelvin_to_celsius) + "C" + " rounded");
        System.out.println("Kelvin to Celsius " + Math.round(Kelvin_to_celsius * 10.0) / 10.0 + "C" + " one decimal");
        System.out.println("Kelvin to Celsius " + Math.round(Kelvin_to_celsius * 100.0) / 100.0 + "C" + " two decimal");



    }
}
