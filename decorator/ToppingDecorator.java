package decorator;

public abstract class ToppingDecorator implements Item {
    
    Item item;

    public ToppingDecorator(Item item) {
        this.item = item;
    }

    public double getCost() {
        return item.getCost();
    }

    public String getItemName() {
        return item.getItemName();
    }

}
