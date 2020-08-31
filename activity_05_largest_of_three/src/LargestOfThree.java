/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 05 - Largest of Three
 */

import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("? ");
        int a = sc.nextInt();
        System.out.print("? ");
        int b = sc.nextInt();
        System.out.print("? ");
        int c = sc.nextInt();
        if (a > b && a > c)
            System.out.println(a + " is the largest!");
        else
            if (b > a && b > c)
                System.out.println(b + " is the largest!");
            else
                System.out.println(c + " is the largest!");
    }
}
