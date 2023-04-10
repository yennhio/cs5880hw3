package decorator;

public class Rice implements Item {

    private double price;
    private String itemName;

    public Rice(double price, String itemName) {
        this.price = price;
        this.itemName = itemName;
    }
    
    public void select() {
        System.out.println("Select: rice" );
    }

    public double getCost() {
        return price;
    }
    
}
