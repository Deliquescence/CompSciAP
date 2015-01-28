/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package ArrayLists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josh Baird
 */
public class ArrayListFunHouse {

    public static ArrayList<Integer> getListOfFactors(int num) {
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                results.add(i);
            }
        }
        return results;
    }

    public static void keepOnlyCompositeNumbers(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (isPrime(nums.get(i))) {
                nums.remove(i);
                i--;
            }
        }
    }

    private static boolean isPrime(Integer n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
