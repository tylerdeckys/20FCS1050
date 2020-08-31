/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 07 - Show Name Ten Times
 */

import java.util.Scanner;

public class ShowNameTenTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("name? ");
        String name = sc.nextLine();
        for (int i = 0; i < 10; i++)
            System.out.println(name);
    }
}
