/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package ElevensLab;

/**
 *
 * @author Josh Baird
 */
public class Card implements Comparable<Card> {

    /**
     * All the names of the faces
     */
    public static final String FACES[] = {
        "",
        "Ace",
        "Two",
        "Three",
        "Four",
        "Five",
        "Six",
        "Seven",
        "Eight",
        "Nine",
        "Ten",
        "Jack",
        "Queen",
        "King"
    };

    private Suit suit;
    private int face;

    /**
     * @return the suit of the card
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @return the friendly suit string
     */
    public String getSuitString() {
        return suit.toString();
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * @return the face (rank) of this card
     */
    public int getFace() {
        return face;
    }

    /**
     * @return the friendly name of this card
     */
    public String getFaceString() {
        return FACES[face];
    }

    /**
     * @param face the face (rank) to set
     */
    public void setFace(int face) {
        this.face = face;
    }

    /**
     * Create a new card
     *
     * @param rank The rank/face of the card
     * @param suit The suit of the card
     */
    public Card(String rank, Suit suit) {
        for (int i = 1; i < FACES.length; i++) {
            if (FACES[i].equalsIgnoreCase(rank)) {
                this.face = i;
            }
        }
        if (this.face == 0) {
            throw new IllegalArgumentException("Face was not a valid card");
        }
        this.suit = suit;
    }

    @Override
    public String toString() {
        return getFaceString() + " of " + getSuitString();
    }

    @Override
    public int compareTo(Card o) {
        if (o.getFace() == this.getFace() && o.getSuit().equals(this.getSuit())) {
            return 0;
        } else {
            return (this.getFace() - o.getFace());
        }
    }
}
