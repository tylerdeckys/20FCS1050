/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Prg01 - LatinSquare
 * Student Name: Tyler Deckys (no partner)
 */

import java.util.Scanner;

class latinSquare {

    static void latinLine(int latinIncreasing, int latinSize) {
        int latinMinus = latinSize;

        for (int i = 0; i < latinSize + 1; i++) {
            if (latinSize == latinIncreasing) {
                latinIncreasing -= latinMinus;
            } else {
                latinIncreasing += 1;
                if (latinIncreasing < 10) {
                    System.out.print(" " + latinIncreasing + " ");
                } else {
                    System.out.print(latinIncreasing + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Order of your Latin Square?");
        int latinSize = sc.nextInt();


        System.out.println("First number in your Latin Square?");
        int latinIncreasing = sc.nextInt();

        while (latinIncreasing >= latinSize || latinIncreasing <= 0) {
            System.out.println("First number must be a positive integer that is smaller than your order.");
            System.out.println("Please enter another first number:");
            latinIncreasing = sc.nextInt();
        }


        latinIncreasing -= 1;
        for (int i = 0; i < latinSize; i++) {
            latinLine(latinIncreasing, latinSize);
            if (latinIncreasing == latinSize) {
                latinIncreasing -= latinSize;
                latinIncreasing += 1;
            } else {
                latinIncreasing += 1;
            }
        }


    }
}
