/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 02 - Distance to Lightning
 */

import java.util.*;

public class DistanceToLightning {

    static final int    SPEED_OF_LIGHT_IN_FEET = 1100;
    static final double FEET_IN_A_MILE         = 5280;

    public static void main(String[] args) {

        // declare and instantiate a Scanner object
        Scanner sc = new Scanner(System.in);

        // prompt the user for a time in seconds
        System.out.print("? ");

        // read and save in a variable
        int sec = sc.nextInt();

        // get the distance in feet
        int feet = sec * SPEED_OF_LIGHT_IN_FEET;

        // convert from feet to miles
        double miles = feet / FEET_IN_A_MILE;

        // show the distance(s)
        String out = String.format("Distance to lightning is %d feet or %.2f miles", feet, miles);
        System.out.println(out);
    }
}
