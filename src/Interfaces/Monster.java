/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package Interfaces;

/**
 *
 * @author Josh Baird
 */
public class Monster {

    protected String myName;

    public Monster() {
        myName = "Monster";
    }

    public Monster(String name) {
        myName = name;
    }

    @Override
    public String toString() {
        return myName + "\n";
    }
}
