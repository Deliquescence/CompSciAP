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

    private String suit;
    private int face;

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the face
     */
    public int getFace() {
        return face;
    }

    /**
     * @return the face string (name)
     */
    public String getFaceString() {
        return FACES[face];
    }

    /**
     * @param face the face to set
     */
    public void setFace(int face) {
        this.face = face;
    }

    public Card(String rank, String suit) {
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
        return getFaceString() + " of " + suit;
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
