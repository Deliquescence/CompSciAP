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
        int i = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                barrel[r][c] = munks.get(i);
                i++;
            }
        }
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
