package decorator;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getTotal() {
        double total = 0;

        for (Item item : items) {
            total += item.getCost();
        }
        
        return total;
    }
}
