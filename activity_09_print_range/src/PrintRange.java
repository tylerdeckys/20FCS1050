/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 09 - Print Range
 */

import java.util.Scanner;

public class PrintRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("? ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i < b; i++)
            System.out.print(i + " ");
        System.out.println();
    }
}
