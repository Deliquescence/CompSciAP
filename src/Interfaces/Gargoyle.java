/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package Interfaces;

/**
 *
 * @author Josh Baird
 */
public class Gargoyle extends Monster {

    private double agility;

    public Gargoyle() {

    }

    public Gargoyle(String name) {
    }

    public Gargoyle(double agility) {
        this.agility = agility;
    }

    @Override
    public String toString() {
        return "Gargoyle of agility " + myName + agility;
    }
}
