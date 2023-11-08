package Week9Exercise25.tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover{

    private int amount;
    private Set<String> uniqueStrings = new HashSet<String>();


    @Override
    public void add(String characterString) {
        if(uniqueStrings.contains(characterString)){
            amount ++;
        }
        uniqueStrings.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return amount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return uniqueStrings;
    }

    @Override
    public void empty() {
        uniqueStrings.clear();
        amount = 0;
    }
    
}
