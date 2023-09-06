package week1;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Insert password: ");
            if (input.next().equals("abcdef")) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Incorrect!");
            }
        }
        System.out.println("Secret is: HEHE");
    }
}
