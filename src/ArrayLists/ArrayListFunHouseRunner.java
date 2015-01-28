/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Josh Baird
 */
public class ArrayListFunHouseRunner {

    public static void main(String[] args) {
        System.out.println(ArrayListFunHouse.getListOfFactors(9));
        System.out.println(ArrayListFunHouse.getListOfFactors(23));
        System.out.println(ArrayListFunHouse.getListOfFactors(50));
        System.out.println(ArrayListFunHouse.getListOfFactors(100));
        System.out.println(ArrayListFunHouse.getListOfFactors(762));

        Integer[] nums = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
        List<Integer> list = new ArrayList<>(Arrays.asList(nums));

        System.out.println(list);
        ArrayListFunHouse.keepOnlyCompositeNumbers(list);
    }
}
