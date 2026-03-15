
class Item {
    String itemCode;
    String itemName;
    double price;
    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Code: " + itemCode);
        System.out.println("Name: " + itemName);
        System.out.println("Price: $" + price);
    }
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}
public class Main {
    public static void main(String[] args) {
        
        Item item1 = new Item("A101", "Laptop", 750.50);
        Item item2 = new Item("B202", "Smartphone", 500.00);

        item1.displayDetails();
        System.out.println("Total cost for 3 units: $" + item1.calculateTotalCost(3));
        System.out.println();

        item2.displayDetails();
        System.out.println("Total cost for 5 units: $" + item2.calculateTotalCost(5));
    }
}