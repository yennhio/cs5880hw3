package decorator;

public class Noodles implements Item {

    private double price;
    private String itemName;

    public Noodles(double price, String itemName) {
        this.price = price;
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;    
    }

    public double getCost() {
        return price;
    }
    
}
