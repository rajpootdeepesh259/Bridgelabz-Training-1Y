package com.ecommerce;

public interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

public abstract class Product {

    private int productId;
    private String name;
    private double price;
	
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        setPrice(price); 
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }
    public abstract double calculateDiscount();
}