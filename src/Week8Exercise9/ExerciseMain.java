package Week8Exercise9;

public class ExerciseMain {
    public static void main(String[] args) {
        // below is the same examle program as in the assignment

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        VehicleRegister vr = new VehicleRegister();

        vr.add(reg3, "milo");
        vr.add(reg2, "milo");
        vr.add(reg1, "moto");


        vr.printRegistrationPlates();
        vr.printOwners();

    }
}
