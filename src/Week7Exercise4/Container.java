package Week7Exercise4;

import java.util.ArrayList;

public class Container {
    private int maximumWeight;
    private ArrayList<Suitcase> container;

    public Container(int weight) {
        this.maximumWeight = weight;
        this.container = new ArrayList<Suitcase>();
    }

    public int totalWeight() {
        int weight = 0;
        for (Suitcase suitcase : container) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maximumWeight) {
            container.add(suitcase);
        }
    }

    public String toString() {
        return container.size() + " suitcases (" + totalWeight() + " kg)";
    }

    public void printThings(){
        for(Suitcase suitcase : container){
            suitcase.printThings();
        }
    }
}
