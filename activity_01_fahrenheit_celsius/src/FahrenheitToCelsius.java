/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 01 - Fahrenheit to Celsius
 */

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        // declare and instantiate a Scanner object
        Scanner sc = new Scanner(System.in);

        // show a prompt asking the user for a temperature in fahrenheit
        System.out.println("F? ");

        // read the temperature in fahrenheit from the user
        double f = sc.nextDouble();
//        System.out.println("f = " + f);

        // convert the temperatue in fahrenheit to celsius
        double c = (f - 32) * 5 / 9;

        // show the temperature in celsius
        System.out.println(f + "F = " + c + "C");
    }
}
