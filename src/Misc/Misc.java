/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package Misc;

import java.util.List;

/**
 *
 * @author Josh Baird
 */
public class Misc {

    public static void main(String[] args) {
        replaceAll(0, 1);


        /* int[] a = {1, 2, 3};
         * int[] b = {1, 2, 3};
         *
         * System.out.println(Arrays.equals(a, b)); */

        /* boolean s[] = new boolean[200];
         * Arrays.fill(s, true);
         * for (int i = 1; i < s.length; i++) {
         * for (int j = i * 2; j < s.length; j += i) {
         * s[j] = !s[j];
         * }
         * }
         * for (int i = 1; i < s.length; i++) {
         * if (s[i]) {
         * System.out.println(i + " ");
         * }
         * }
         * // for (boolean x : s) {
         * // System.out.println(x);
         * // } */
    }

    public static boolean hasMoreVowelsThanConsonants(String word) {
        int vCount = 0, cCount;

        Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char c : word.toCharArray()) {
            for (char v : vowels) {
                if (c == v) {
                    vCount++;
                }
            }
        }
        cCount = word.length() - vCount;

        return vCount > cCount;
    }

    public static void stringRemoverMachine(List<String> words) {
        for (String x : words) {
            if (!hasMoreVowelsThanConsonants(x)) {
                words.remove(x);
            }
        }
    }

    private static int[][] mat = {{0, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1}};

    public static void replaceAll(int oldVal, int newVal) {
        for (int r = 0; r < mat.length; r++) {
            for (int x = 0; x < mat[r].length; x++) {
                if (mat[r][x] == oldVal) {
                    mat[r][x] = newVal;
                }
            }
        }
    }

}
