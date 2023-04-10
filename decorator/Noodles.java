package decorator;

public class Noodles implements Item {

    private double price;
    private String itemName;

    public Noodles(double price, String itemName) {
        this.price = price;
        this.itemName = itemName;
    }

    public void select() {
        System.out.println("Select: noodles");    
    }

    public double getCost() {
        return price;
    }
    
}
