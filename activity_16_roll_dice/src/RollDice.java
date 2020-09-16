/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 16 - Roll Dice
 */

import java.util.Random;

public class RollDice {

    public static void main(String[] args) {
        Random r = new Random();
        int sum6 = 0;
        for (int i = 0; i < 1000; i++) {
            // int die = (int) (Math.random() * 6 + 1);
            int die = r.nextInt(6) + 1;
            // System.out.println(die);
            if (die == 6)
                sum6++;
        }
        System.out.println("Prob. of getting a 6 is " + sum6 / 1000.);
    }
}
