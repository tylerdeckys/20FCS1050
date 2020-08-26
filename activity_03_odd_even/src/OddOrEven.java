/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 03 - Odd or Even
 */

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("? ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number entered is even.");
            System.out.println("I like even numbers!");
        }
        else
            System.out.println("The number entered is odd.");
    }
}
