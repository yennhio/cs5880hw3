package decorator;

public abstract class Topping implements Item {
    Item item;

    public Topping(Item item) {
        this.item = item;
    }

    public void select() {
        item.select();
    }
    
}
