package decorator;

public class CheeseTopping extends ToppingDecorator {

    private double price = 2.99;
    private String itemName;

    public CheeseTopping(Item item) {
        super(item);
    }

    public String getItemName() {
        return super.getItemName() + " with " + itemName;
    }

    public double getCost() {
        return super.getCost() + price;
    }
}