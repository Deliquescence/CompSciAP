/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package ElevensLab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 *
 * @author Josh Baird
 */
public class Deck {

    private ArrayList<Card> cards = new ArrayList<>();
    private int size;

    public Deck(String[] ranks, Suit[] suits) {
        for (int i = 0; i < ranks.length; i++) {
            cards.add(new Card(ranks[i], suits[i]));
        }
        this.size = cards.size();
    }

    public Deck(Collection<Card> cards) {
        this.cards.addAll(cards);
        this.size = cards.size();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public Card deal() {
        size--;
        if (size < 0) {
            return null;
        }
        return cards.get(size);
    }

    public void shuffle() {
        Random r = new Random();
        Card[] unshuffled = cards.toArray(new Card[0]);
        Card[] shuffled = new Card[size];

        for (int k = 0; k < size; k++) {
            int j;
            do {
                /* "Repeatedly generate a random integer j between 0 and 51, inclusive until
                 * cards[j] contains a card(not marked as empty);" */
                j = r.nextInt(size);
                if (unshuffled[j] != null) {
                    break;
                }
            } while (true);
            shuffled[k] = unshuffled[j];
            unshuffled[j] = null;
        }
        for (int i = 0; i < size; i++) {
            cards.set(i, shuffled[i]);
        }
    }
}
