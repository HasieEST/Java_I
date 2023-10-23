package Week7Exercise4;

import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int weight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = weight;
    }

    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    private String restOfPhrase() {
        return "(" + totalWeight() + "kg)";
    }

    public String toString() {
        if (things.size() == 0) {
            return "empty" + restOfPhrase();
        }
        if (things.size() == 1) {
            return things.size() + " thing " + restOfPhrase();
        }
        return things.size() + " things " + restOfPhrase();
    }

    public void printThings(){
        for(Thing thing : things){
            System.out.println(thing);
        }
    }

    public Thing heaviestThing(){
        if(things.size()!= 0){
            Thing heaviestThing = things.get(0);
            for(Thing thing : things){
                if(thing.getWeight() > heaviestThing.getWeight()){
                    heaviestThing = thing;
                }
            }
            return heaviestThing;
        }
        return null;
    }

}
