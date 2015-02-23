/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package Matrices;

import java.util.List;

/**
 *
 * @author Josh Baird
 */
public class BarrelOfFun {

    private Monkey[][] barrel;

    public BarrelOfFun(int rows, int cols, List<Monkey> munks) {

    }

    public Monkey getMonkeyWithMostBannas() {
        Monkey theMonkey = barrel[0][0];

        for (Monkey[] r : barrel) {
            for (Monkey m : r) {
                if (m.getBannaCount() > theMonkey.getBannaCount()) {
                    theMonkey = m;
                }
            }
        }
        return theMonkey;
    }
}
