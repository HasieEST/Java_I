package Week10Mandatory;

public class Hamburger {
    private String name;
    private String meat;
    private Double price;
    private String breadRollType;
    private String[] additionNames = new String[4];
    private Double[] additionPrices = new Double[4];

    public Hamburger(String name, String meat, Double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, Double price) {
        addAddition(0, name, price);
    }

    public void addHamburgerAddition2(String name, Double price) {
        addAddition(1, name, price);
    }

    public void addHamburgerAddition3(String name, Double price) {
        addAddition(2, name, price);
    }

    public void addHamburgerAddition4(String name, Double price) {
        addAddition(3, name, price);
    }

    public Double itemizeHamburger() {
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
        for (int i = 0; i < additionNames.length; i++) {
            if (additionNames[i] != null && !additionNames[i].isEmpty()) {
                System.out.println("Added " + additionNames[i] + " for an extra " + additionPrices[i]);
            }
        }
        return price + getTotalAdditionPrice();
    }

    private void addAddition(int index, String name, Double price) {
        additionNames[index] = name;
        additionPrices[index] = price;
    }

    public Double getTotalAdditionPrice() {
        double total = 0.0;
        for (int i = 0; i < additionPrices.length; i++) {
            if (additionNames[i] != null && !additionNames[i].isEmpty()) {
                total += additionPrices[i];
            }
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public Double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

}
