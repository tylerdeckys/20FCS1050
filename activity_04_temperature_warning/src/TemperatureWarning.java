/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 04 - Temperature Warning
 */

import java.util.Scanner;

public class TemperatureWarning {

    final static int HEAT_WARNING_THRESHOLD = 90;
    final static int COLD_WARNING_THRESHOLD = 30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("? ");
        int temperature = sc.nextInt();
        if (temperature > HEAT_WARNING_THRESHOLD)
            System.out.println("Heat Warning!");
        else if (temperature < COLD_WARNING_THRESHOLD)
            System.out.println("Cold Warning!");
        else
            System.out.println("Enjoy the nice weather (while it last)...");
    }
}
