package com.library;

public class Book {

    static String libraryName = "City Central Library";
    protected int bookId;
    protected String title;
    protected double price;
    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
    public double calculateFine(int daysLate) {
        return 0; 
    }
    public void display() {
        System.out.println("Library: " + libraryName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}