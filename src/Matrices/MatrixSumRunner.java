/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package Matrices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Josh Baird
 */
public class MatrixSumRunner {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/matrices/matsum.dat");
        System.out.println(file.getAbsolutePath());
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            Scanner subScanner = new Scanner(scan.nextLine());
            int x = subScanner.nextInt();
            int y = subScanner.nextInt();
            System.out.println("The sum around " + x + ", " + y + " is " + MatrixSumming.sumAround(x, y));
        }
    }

}
