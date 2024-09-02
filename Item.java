/**
 * Represents an item in the shopping cart.
 */
public class Item {
    private String name;
    private double price;
    private int quantity;

    /**
     * Creates an item with a name, price, and quantity.
     * @param name The item name.
     * @param price The item price.
     * @param quantity The item quantity.
     */
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Gets the item name.
     * @return The name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the total price for the item.
     * @return The price.
     */
    public double getPrice() {
        return price * quantity;
    }

    /**
     * Gets the quantity of the item.
     * @return The quantity.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Provides a string with the item details.
     * @return A string describing the item.
     */
    @Override
    public String toString() {
        return name + " - $" + price + " x " + quantity;
    }
}
