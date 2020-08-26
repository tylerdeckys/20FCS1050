/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 13 - Circle Basics
 */

import java.util.Scanner;

public class CircleBasics {

    public static void main(String[] args) {

        // instantiate a scanner associated with the standard input (keyboard)
        Scanner sc = new Scanner(System.in);

        // show the user a prompt asking for the radius
        System.out.print("radius (must be >0)? ");

        // read the radius
        double radius = sc.nextDouble();

        // validate the user input
        if (radius <= 0)  // input is invalid!
            System.out.println("radius must be > 0!");  // show an error message!
        // input is valid -> proceed to compute the area and the circumference
        else {
            // compute the area
            double area = Math.PI * Math.pow(radius, 2);
            // double area = Math.PI * radius * radius; // also correct!
            // compute the circumference
            double circumference = 2 * Math.PI * radius;
            // display the area and the circumference
            System.out.println("area = " + String.format("%.2f", area));
            System.out.println("circumference = " + String.format("%.2f", circumference));
        }
    }
}
