package Week10Mandatory;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private Double healthyExtra1Price;
    private String healthyExtra2Name;
    private Double healthyExtra2Price;

    public HealthyBurger(String meat, Double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1(String name, Double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, Double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public Double itemizeHamburger() {
        System.out.println(getName() + " burger on a " + getBreadRollType() + " roll with " + getMeat()
                + ", price is " + getPrice());

        if (healthyExtra1Name != null && !healthyExtra1Name.isEmpty()) {
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }

        if (healthyExtra2Name != null && !healthyExtra2Name.isEmpty()) {
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }

        return getPrice() + (healthyExtra1Price != null ? healthyExtra1Price : 0)
                + (healthyExtra2Price != null ? healthyExtra2Price : 0);
    }

    
}
