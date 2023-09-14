package week1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insert a year:");
        int year = Integer.parseInt(input.next());
        if ((year % 4 == 0 && year % 100 > 1)||(year % 100 == 0 && year % 400 == 0))  {
            System.out.println("Inserted year:" + String.valueOf(year) + " is a leapyear");
        } else {
            System.out.println("Inserted year: " + String.valueOf(year) + " is not a leapyear");
        }
        input.close();
    }
}