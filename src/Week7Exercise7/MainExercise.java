package Week7Exercise7;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.Start();

    }
}
