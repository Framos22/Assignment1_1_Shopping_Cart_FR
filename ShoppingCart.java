import java.util.Arrays;

/**
 * Represents a shopping cart using a ResizableArrayBag to hold items.
 */
public class ShoppingCart<T> {
    private ResizableArrayBag<T> cart;

    /**
     * Creates a shopping cart with a default capacity.
     */
    public ShoppingCart() {
        cart = new ResizableArrayBag<>();
    }

    /**
     * Adds an item to the cart.
     * @param newItem The item to add.
     * @return true if the item was added.
     */
    public boolean addItem(T newItem) {
        return cart.add(newItem);
    }

    /**
     * Removes an item from the cart.
     * @param item The item to remove.
     * @return true if the item was removed.
     */
    public boolean removeItem(T item) {
        return cart.remove(item);
    }

    /**
     * Clears all items from the cart.
     */
    public void clearCart() {
        cart.clear();
    }

    /**
     * Displays all items in the cart.
     */
    public void displayCart() {
        T[] items = cart.toArray();
        System.out.println("Shopping Cart contains " + cart.getCurrentSize() + " item(s): " + Arrays.toString(items));
    }

    /**
     * Calculates the total price of items in the cart.
     * Assumes the cart holds Item objects.
     * @return The total price.
     */
    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        T[] items = cart.toArray();
        for (T item : items) {
            if (item instanceof Item) {
                totalPrice += ((Item) item).getPrice();
            }
        }
        return totalPrice;
    }

    /**
     * Counts the total number of items in the cart.
     * @return The number of items.
     */
    public int countItems() {
        return cart.getCurrentSize();
    }

    /**
     * Applies a discount to the total price.
     * @param discountRate The discount percentage.
     * @return The discounted price.
     */
    public double applyDiscount(double discountRate) {
        double totalPrice = calculateTotalPrice();
        return totalPrice - (totalPrice * discountRate / 100);
    }
}

