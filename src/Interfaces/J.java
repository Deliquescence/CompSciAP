/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package Interfaces;

/**
 *
 * @author Josh Baird
 */
public class J {

    private int x, y;

    public J() {
        x = y = 3;
    }

    public void fun() {
        x = y = 6;
    }

    public int back() {
        return 1;
    }

    public String toString() {
        return x + "" + y;
    }
}
