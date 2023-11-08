package Week8Exercise9;

import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister(){
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner){
        if(owners.get(plate)==null){
            owners.put(plate,owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        if(owners.get(plate)!=null){
            return owners.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate){
        if(owners.get(plate)!=null){
            owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates(){
        for(RegistrationPlate plate: owners.keySet()){
            System.out.println(plate);
        }
    }

    public void printOwners(){
        for(String owner: new HashSet<String>(owners.values())){
            System.out.println(owner);
        }
    }
}
