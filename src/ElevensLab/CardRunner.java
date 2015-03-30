/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package ElevensLab;

import java.util.TreeSet;

/**
 *
 * @author Josh Baird
 */
public class CardRunner {

    public static void main(String[] args) {
        TreeSet<Card> ss = new TreeSet<>();

        ss.add(new BlackJackCard("two", Suit.Club));
        ss.add(new BlackJackCard("five", Suit.Spade));
        ss.add(new BlackJackCard("king", Suit.Heart));
        ss.add(new BlackJackCard("jack", Suit.Diamond));
        ss.add(new BlackJackCard("ace", Suit.Spade));

        for (Card c : ss) {
            System.out.println(c);
        }
    }
}
