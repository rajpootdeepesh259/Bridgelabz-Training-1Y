package com.employee;
    class Developer extends Employee {
        String programmingLanguage;

        Developer(String name, int id, double salary, String programmingLanguage) {
            super(name, id, salary);
            this.programmingLanguage = programmingLanguage;
        }

        void displayDetails() {
            System.out.println("Developer: " + name + ", ID: " + id + ", Salary: " + salary + ", Language: " + programmingLanguage);
        }
    }

