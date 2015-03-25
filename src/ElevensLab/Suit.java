/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package ElevensLab;

/**
 *
 * @author Josh Baird
 */
public enum Suit {

    Club, Diamond, Heart, Spade;

    @Override
    public String toString() {
        return name() + "s";
    }
}
