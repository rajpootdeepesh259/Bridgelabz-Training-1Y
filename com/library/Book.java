package com.library;
    class Book {
        String title;
        int publicationYear;

        Book(String title, int publicationYear) {
            this.title = title;
            this.publicationYear = publicationYear;
        }

        void displayInfo() {
            System.out.println("Title: " + title + ", Year: " + publicationYear);
        }
    }

