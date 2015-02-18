/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package Matrices;

/**
 *
 * @author Josh Baird
 */
public class PascalsTriangle {

    private static int binomial(int n, int k) {
        if (k > n - k) {
            k = n - k;
        }

        int b = 1;
        for (int i = 1, m = n; i <= k; i++, m--) {
            b = b * m / i;
        }
        return b;
    }

    public static int[][] getRows(int n) {
        int[][] triangle = new int[n][];
        for (int r = 0; r < n; r++) {
            int[] row = new int[r + 1];
            for (int x = 0; x < row.length; x++) {
                row[x] = binomial(r, x);
            }
            triangle[r] = row;
        }
        return triangle;
    }

    public static void niceOutput(int[][] tri) {
        for (int r = 0; r < tri.length; r++) {
            int spaces = (tri.length - 1) - (r);
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }

            for (int x : tri[r]) {
                System.out.printf(" %3d", x);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.deepToString(getRows(7)));
        niceOutput(getRows(10));
    }
}
