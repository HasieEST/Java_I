package Week7Exercise7;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void Start() {
        System.out.println("Statements:");
        System.out.println("    add - adds a word pair to the dictionary\n"
                + "    translate - asks a word and prints its translation\n"
                + "    quit - quit the text user interface");

        while (true) {
            System.out.println();
            System.out.println("Statement: ");
            String input = getWord();
            input = stringCleaner(input);
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            else if (input.equals("add")) {
                add();
            }
            else if (input.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement!");
            }
        }

    }

    public void add() {
        System.out.println("In Estonian: ");
        String word = getWord();
        System.out.println("Translation: ");
        String translation = getWord();
        dictionary.add(word, translation);
    }

    public void translate() {
        System.out.println("Give a word: ");
        String word = getWord();
        if (dictionary.translate(word) == null) {
            System.out.println("Unknown word!");
        } else {
            System.out.println("Translation: " + dictionary.translate(word));
        }
    }

    public String getWord() {
        return reader.nextLine();
    }

    public String stringCleaner(String string) {
        return string.toLowerCase().trim();
    }
}
