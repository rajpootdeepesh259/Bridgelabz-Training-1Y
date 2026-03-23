package com.employee;
    public class Main {
        public static void main(String[] args) {

            Employee e1 = new Manager("Aman", 101, 80000, 5);
            Employee e2 = new Developer("Rahul", 102, 60000, "Java");
            Employee e3 = new Intern("Neha", 103, 20000, 6);

            e1.displayDetails();
            e2.displayDetails();
            e3.displayDetails();
        }
    }

