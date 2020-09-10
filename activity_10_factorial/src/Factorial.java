/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 10 - Factorial
 */

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n? ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("n must be >= 0");
            System.exit(1);
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++)
            factorial *= i;
        System.out.println(n + "! = " + factorial);
    }
}
