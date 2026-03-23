package com.employee;
    class Manager extends Employee {
        int teamSize;

        Manager(String name, int id, double salary, int teamSize) {
            super(name, id, salary);
            this.teamSize = teamSize;
        }

        void displayDetails() {
            System.out.println("Manager: " + name + ", ID: " + id + ", Salary: " + salary + ", Team Size: " + teamSize);
        }
    }

