package com.food;

public class Runner {

    public static void printBill(FoodItem item) {

        item.getItemDetails();

        double total = item.calculateTotalPrice();
        double discount = 0;

        if (item instanceof Discountable) {
            Discountable d = (Discountable) item;
            discount = d.applyDiscount();
            System.out.println(d.getDiscountDetails());
        }

        double finalAmount = total - discount;

        System.out.println("Total Price: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        FoodItem f1 = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 300, 2);

        FoodItem[] orders = {f1, f2};

        for (FoodItem item : orders) {
            printBill(item); 
        }
    }
}