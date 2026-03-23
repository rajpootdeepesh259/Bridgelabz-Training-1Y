package com.employee;

    class Intern extends Employee {
        int duration;

        Intern(String name, int id, double salary, int duration) {
            super(name, id, salary);
            this.duration = duration;
        }

        void displayDetails() {
            System.out.println("Intern: " + name + ", ID: " + id + ", Salary: " + salary + ", Duration: " + duration + " months");
        }
    }

