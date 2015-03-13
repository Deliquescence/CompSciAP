/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package Interfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Josh Baird
 */
public class WordRunner {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/interfaces/word.dat");
        System.out.println(file.getAbsolutePath());
        Scanner scan = new Scanner(file);

        ArrayList<Word> list = new ArrayList<>();
        while (scan.hasNext()) {
            list.add(new Word(scan.next()));
        }
        Word[] words = list.toArray(new Word[0]);
        Arrays.sort(words);
        for (Word t : words) {
            System.out.println(t.getWord());
        }
    }
}
