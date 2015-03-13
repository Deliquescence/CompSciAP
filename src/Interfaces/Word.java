/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package Interfaces;

/**
 *
 * @author Josh Baird
 */
public class Word implements Comparable<Word> {

    private final String Word;

    public Word(String w) {
        this.Word = w;
    }

    @Override
    public int compareTo(Word t) {
        if (this.getWord().length() < t.getWord().length()) {
            return -2;
        } else if (this.getWord().length() > t.getWord().length()) {
            return 2;
        } else {
            return this.getWord().compareTo(t.getWord());
        }
    }

    @Override
    public String toString() {
        return getWord();
    }

    /**
     * @return the Word
     */
    public String getWord() {
        return Word;
    }
}
