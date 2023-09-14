package week2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    private static int drawNumber() {
        Random random = new Random();
        return random.nextInt(101); // 0-100
    }


    public static void main(String[] args) {
        int randomNumber = drawNumber();
        Scanner input = new Scanner(System.in);
        int i = 1;
        
        while (true) {
            System.out.print("Guess a number: ");
            
            if (input.hasNextInt()) {
                int guess = input.nextInt(); //Store int into variable
             
                if (guess == randomNumber) {
                    System.out.println("Congratulations, your guess is correct!");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("The number is greater, guesses made: " + i);
                } else {
                    System.out.println("The number is smaller, guesses made: " + i);
                }
                
                i++;
            } else {
                System.out.println("Guess made is not a number!");
                input.next(); //Throw invalid input away for new input
            }
        }
        
        input.close();
    }
}
