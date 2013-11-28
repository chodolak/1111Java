package q4;

import java.text.NumberFormat;

public class ShoppingCart {
    private int itemCount; // total number of items in the cart
    private double totalPrice; // total price of items in the cart
    private int capacity; // current cart capacity
    private Item[] cart;
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    // ---------------------------------------------------------
    // Creates an empty shopping cart with a capacity of 5 items.
    // ---------------------------------------------------------
    public ShoppingCart() {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }
    
    // -----------------------------------------------------
    // Adds an item to the shopping cart.
    // -----------------------------------------------------
    public void addToCart(String itemName, double price, int quantity) {
            Item add = new Item(itemName, price, quantity);
            cart[itemCount] = add;
            itemCount++;
            totalPrice = totalPrice + (price * quantity);
    }
    
    // -----------------------------------------------------
    // Returns the contents of the cart together with
    // summary information.
    // -----------------------------------------------------
    public String toString() {

        
        String contents = "\nShopping Cart\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
        
        for (int i = 0; i < itemCount; i++){
            contents += cart[i].toString() + "\n";
        }
        return contents;
    }
    
    // -----------------------------------------------------
    // Increases the capacity of the shopping cart by 3
    // -----------------------------------------------------
    public void increaseSize() {
        capacity += 3; 
        Item[] temp = new Item[capacity];
        
        for (int i = 0; i < capacity; i++) {
            temp[i] = cart[i];
        }
        cart = temp;
    }
    
    public String getTotalPrice() {
        return fmt.format(totalPrice);
    }
    
    public int getCapacity() {
        return capacity;
    }
    
}