package com.animal;
    class Dog extends Animal {

        Dog(String name, int age) {
            super(name, age);
        }

        void makeSound() {
            System.out.println(name + " says: Woof Woof");
        }
    }

