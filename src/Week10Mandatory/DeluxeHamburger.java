package Week10Mandatory;

public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White Roll");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, Double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, Double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, Double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, Double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
