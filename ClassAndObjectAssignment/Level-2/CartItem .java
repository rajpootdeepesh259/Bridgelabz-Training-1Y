import java.util.ArrayList;
import java.util.Iterator;

class CartItem {
    String itemName;
    double price;
    int quantity;

 
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> items;

   
    ShoppingCart() {
        items = new ArrayList<>();
    }

    void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to the cart.");
    }

    
    void removeItem(String itemName) {
        Iterator<CartItem> iterator = items.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.itemName.equalsIgnoreCase(itemName)) {
                iterator.remove();
                System.out.println(itemName + " removed from the cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    void displayTotalCost() {
        double total = 0;
        System.out.println("\nItems in Cart:");
        for (CartItem item : items) {
            System.out.println(item.itemName + " - $" + item.price + " x " + item.quantity + " = $" + item.getTotalCost());
            total += item.getTotalCost();
        }
        System.out.println("Total Cost: $" + total);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new CartItem("Laptop", 750.0, 1));
        cart.addItem(new CartItem("Mouse", 25.0, 2));
        cart.addItem(new CartItem("Keyboard", 50.0, 1));

        cart.displayTotalCost();

        cart.removeItem("Mouse");

        cart.displayTotalCost();
    }
}