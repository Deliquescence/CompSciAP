/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package Matrices;

/**
 *
 * @author Josh Baird
 */
public class Monkey {

    private int bannaCount;
    private double strength;

    public Monkey(int bc, double s) {
        bannaCount = bc;
        strength = s;
    }

    /**
     * @return the bannaCount
     */
    public int getBannaCount() {
        return bannaCount;
    }

    /**
     * @param bannaCount the bannaCount to set
     */
    public void setBannaCount(int bannaCount) {
        this.bannaCount = bannaCount;
    }

    /**
     * @return the strength
     */
    public double getStrength() {
        return strength;
    }

    /**
     * @param strength the strength to set
     */
    public void setStrength(double strength) {
        this.strength = strength;
    }

}
