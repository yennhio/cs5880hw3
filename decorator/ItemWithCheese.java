package decorator;

public class ItemWithCheese implements Item {

    private Item decoratedItem;
    public ItemWithCheese(Item item) {
        this.decoratedItem = item;
    }

    public void select() {
        decoratedItem.select();
    }
    @Override
    public double getCost() {
        return decoratedItem.getCost();
    }
}