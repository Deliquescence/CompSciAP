/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package Matrices;

import java.util.Scanner;

/**
 *
 * @author Josh Baird
 */
public class MatrixMath {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many matrices?");
        int numMatricies = scan.nextInt();
        int[][][] matricies = new int[numMatricies][][];

        for (int i = 0; i < numMatricies; i++) {
            matricies[i] = getMatrix(i + 1);
        }
    }

    /**
     *
     * @param n The nth matrix we are on (For nice text only)
     *
     * @return The matrix the user inputs
     */
    public static int[][] getMatrix(int n) {
        System.out.printf("What is the size of (square) matrix number %d?\n", n);
        int size = scan.nextInt();
        int[][] mat = new int[size][size];

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                System.out.printf("What is the value of position %d, %d?\n", r, c);

                mat[r][c] = scan.nextInt();
            }
        }
        return mat;
    }
}
