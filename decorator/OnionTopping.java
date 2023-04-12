package decorator;

public class OnionTopping extends ToppingDecorator {

    private double price = 1.99;
    private String itemName;

    public OnionTopping(Item item) {
        super(item);
    }

    public String getItemName() {
        return super.getItemName() + " with " + itemName;
    }

    public double getCost() {
        return super.getCost() + price;
    }
}