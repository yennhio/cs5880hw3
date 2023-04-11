package decorator;

public class FoodDriver {
    
    public static void main(String [] args) {
        Item riceWithCheese = new CheeseTopping(new Rice(8.99, "rice"));

        Order order = new Order();
        order.addItem(riceWithCheese);

        System.out.println("Total cost: " + order.getTotal());
        
    }
}
