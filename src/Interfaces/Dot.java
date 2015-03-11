/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package Interfaces;

/**
 *
 * @author Josh Baird
 */
public class Dot implements Locatable {

    private int x, y, size;

    public Dot() {
    }

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Dot(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    @Override
    public String toString() {
        return "X: " + this.getXPos() + " Y: " + this.getYPos() + " Size: " + this.size;
    }

    /**
     * @return the x
     */
    @Override
    public int getXPos() {
        return x;
    }

    /**
     * @return the y
     */
    @Override
    public int getYPos() {
        return y;
    }

}
