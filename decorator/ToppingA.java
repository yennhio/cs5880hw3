package decorator;

public class ToppingA implements Item {
    private Item toppingOne;
    public ToppingA(Item item) {
        this.toppingOne = item;
    }

    public void select() {
        
    }
    
}
