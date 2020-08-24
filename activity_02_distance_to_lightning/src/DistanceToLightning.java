/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 02 - Distance to Lightning
 */

import java.util.*;

public class DistanceToLightning {

    public static void main(String[] args) {

        // declare and instantiate a Scanner object
        Scanner sc = new Scanner(System.in);

        // prompt the user for a time in seconds
        System.out.print("? ");

        // read and save in a variable
        int sec = sc.nextInt();

        // get the distance in feet
        int feet = sec * 1100;

        // convert from feet to miles
        double miles = feet / 5280.;

        // show the distance(s)
        String out = String.format("Distance to lightning is %d feet or %.2f miles", feet, miles);
        System.out.println(out);
    }
}
