package com.ecommerce;

public class Runner{

    public static void printFinalPrice(Product product) {

        double price = product.getPrice();
        double discount = product.calculateDiscount();
        double tax = 0;
        if (product instanceof Taxable) {
            Taxable t = (Taxable) product;
            tax = t.calculateTax();
            System.out.println(t.getTaxDetails());
        }
        double finalPrice = price + tax - discount;
        System.out.println("Product: " + product.getName());
        System.out.println("Base Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Product p1 = new Electronics(101, "Laptop", 50000);
        Product p2 = new Clothing(102, "T-Shirt", 2000);
        Product p3 = new Groceries(103, "Rice", 1000);
        Product[] products = {p1, p2, p3};
        for (Product p : products) {
            printFinalPrice(p); 
        }
    }
}