package week2;

public class Printing {
    private static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
    
    private static void printSquare(int sideSize){
        for(int i = 0; i < sideSize; i++){
            printStars(sideSize);
        }
    }

    private static void printRectangle(int width, int height){
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    private static void printTrinagle(int size){
        for (int i = 0; i < size; i++) {
            printStars(i+1);
        }
    }


    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printSquare(4);
        printRectangle(3, 4);
        printTrinagle(5);
    }
}
