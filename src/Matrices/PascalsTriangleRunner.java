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
public class PascalsTriangleRunner {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/matrices/triangle.dat");
        System.out.println(file.getAbsolutePath());
        Scanner scan = new Scanner(file);

        while (scan.hasNextInt()) {
            PascalsTriangle.printTriangleOfSize(scan.nextInt());
        }
    }
}
