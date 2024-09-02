/**
 * Tests the ShoppingCart class.
 */
public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart<Item> cart = new ShoppingCart<>();

        // Add items to the cart
        Item item1 = new Item("Apple", 0.99, 5);
        Item item2 = new Item("Banana", 0.59, 3);
        Item item3 = new Item("Orange", 1.29, 2);
        
        System.out.println("Adding items to the cart:");
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.displayCart();
        
        // Calculate total price
        System.out.println("Total price: $" + cart.calculateTotalPrice());

        // Apply discount
        double discountedPrice = cart.applyDiscount(10);
        System.out.println("Total price after 10% discount: $" + discountedPrice);

        // Remove an item
        System.out.println("Removing item: Banana");
        cart.removeItem(item2);
        cart.displayCart();

        // Clear the cart
        System.out.println("Clearing the cart.");
        cart.clearCart();
        cart.displayCart();
    }
}
