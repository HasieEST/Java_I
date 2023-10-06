package week3;

import java.util.ArrayList;

public class AmountInList {

    // Exercise 61
    private static int countItems(ArrayList<String> list) {
        return list.size();
    }

    // Exercise 62

    private static void removeLast(ArrayList<String> list) {
        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));

        System.out.println('\n');

        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);

        // sorting brothers
        brothers.sort(null);

        // removing the last item
        removeLast(brothers);

        System.out.println(brothers);
    }
}
