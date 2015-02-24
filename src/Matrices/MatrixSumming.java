/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package Matrices;

/**
 *
 * @author Josh Baird
 */
public class MatrixSumming {

    private static final int[][] providedMatrix = {
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 0},
        {6, 7, 1, 2, 5},
        {6, 7, 8, 9, 0},
        {5, 4, 3, 2, 1}
    };

    public static int sumAround(int x, int y) {
        int sum = 0;
        //y = providedMatrix.length - y;

        try {
            sum += (providedMatrix[x - 1][y - 1]); //Upper Left
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Ignore
        }

        try {
            sum += (providedMatrix[x][y - 1]); //Above
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Ignore
        }

        try {
            sum += (providedMatrix[x + 1][y - 1]); //Upper Right
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Ignore
        }

        try {
            sum += (providedMatrix[x - 1][y]); //Right
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Ignore
        }

        try {
            sum += (providedMatrix[x][y]); //Center
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Ignore
        }

        try {
            sum += (providedMatrix[x + 1][y]); //Left
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Ignore
        }

        try {
            sum += (providedMatrix[x - 1][y + 1]); //Lower Left
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Ignore
        }

        try {
            sum += (providedMatrix[x][y + 1]); //Below
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Ignore
        }

        try {
            sum += (providedMatrix[x + 1][y + 1]); //Lower Right
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Ignore
        }

        return sum;
    }
}
