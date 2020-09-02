import java.util.Scanner;

/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 08 - Less than a number
 */
public class LessThanNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("? ");
        int number = sc.nextInt();
        if (number < 0)
            System.out.println("Number should be >= 0!");
        else {
            for (int i = 0; i < number; i++)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
