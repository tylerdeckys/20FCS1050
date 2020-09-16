/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 18 - Decrypt
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Decrypt {

    public static void main(String[] args) throws FileNotFoundException {

        // TODOd: open the "encrypted.txt" file
        Scanner in = new Scanner(new FileInputStream("encrypted.txt"));

        // TODOd: create an output string
        String out = "";
        // PrintStream out = new PrintStream(new FileOutputStream("decrypted.txt"));

        // TODOd: read one line at a time using a loop
        while (in.hasNext()) {
            String line = in.nextLine();

            // TODOd: read one character at a time using a 2nd loop
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                // TODOd: if the character is a period, write a space in the output string
                if (c == '.')
                    out += " ";
                    // out.print(" ");
                // TODOd: else, if the character is a space, write a dash in the output string
                else if (c == ' ')
                    out += "-";
                    // out.print("-");
                // TODOd: else, write the character that is 10 codes less in the output string
                else {
                    out += Character.toString(c - 10);
                     // out += (char)((int) c - 10);
                     // out.print((char)((int) c - 10));
                }
            }
            out += "\n";
            // out.println();
        }

        // TODOd: display the output string
        System.out.println(out);

        // TODOd: close the input file
        in.close();
        // out.close();
    }
}