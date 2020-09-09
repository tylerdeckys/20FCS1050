/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Prg01 - LatinSquareTest (use this program to check if your squares are correct)
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LatinSquareTest {

    // change the following parameters to test one of your squares
    static final int ORDER = 5;
    static final int FIRST = 2;

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Testing order=" + ORDER + "; first=" + FIRST);
        String fileName = "latin_square_" + ORDER + "_" + FIRST + ".txt";
        Scanner correct = new Scanner(new FileInputStream("latin_squares/" + fileName));
        Scanner toTest = new Scanner(new FileInputStream(fileName));
        int lineNumber = 1;
        boolean failed = false;
        while (correct.hasNextLine()) {
            String correctLine = correct.nextLine();
            correctLine = correctLine.strip();
            String lineToTest = toTest.nextLine();
            lineToTest = lineToTest.strip();
            if (!correctLine.equals(lineToTest)) {
                System.out.println("Line #" + lineNumber + " didn't match!");
                System.out.println("Expected: \"" + correctLine + "\"");
                System.out.println("Found:    \"" + lineToTest + "\"");
                failed = true;
                break;
            }
            lineNumber++;
        }
        correct.close();
        toTest.close();
        if (failed)
            System.out.println("Result: FAILED!");
        else
            System.out.println("PASSED!");
    }
}
