/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 06 - Letter Grade
 */

import java.util.Scanner;

public class LetterGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name? ");
        String name = sc.nextLine();
        System.out.print("Grade? ");
        double grade = sc.nextDouble();
        System.out.print(name + ": ");
        if (grade >= 94)
            System.out.println("A");
        else
            if (grade >= 90)
                System.out.print("A-");
            else
                if (grade >= 87)
                    System.out.print("B+");
                else
                    if (grade >= 83)
                        System.out.println("B");
                    else
                        if (grade >= 80)
                            System.out.print("B-");
                        else
                            if (grade >= 77)
                                System.out.print("C+");
                            else
                                if (grade >= 73)
                                    System.out.print("C");
                                else
                                    if (grade >= 70)
                                        System.out.print("C-");
                                    else
                                        if (grade >= 67)
                                            System.out.print("D+");
                                        else
                                            if (grade >= 60)
                                                System.out.print("D");
                                            else
                                                System.out.print("F");
    }
}
