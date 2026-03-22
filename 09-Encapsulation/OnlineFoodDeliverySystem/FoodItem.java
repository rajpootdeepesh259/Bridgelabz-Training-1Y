package com.food;

public interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}
public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        setPrice(price);
        setQuantity(quantity);
    }
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity!");
        }
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}