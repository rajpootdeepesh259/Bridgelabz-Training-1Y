package MapInterface;

import java.util.*;
class Products {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        inventory.put("Milk",10);
        inventory.put("Bread",5);
        inventory.put("Eggs",12);

        System.out.println("Initial Inventory: "+inventory);

        buyProduct(inventory, "Milk",3);
        buyProduct(inventory, "Bread",7);
        System.out.println("\nAfter purchases :- "+inventory);

        restockProduct(inventory,"Bread", 10);
        restockProduct(inventory, "Butter",7);

        System.out.println("\nAfter restocking :- "+inventory);

        checkStock(inventory, "Milk");
        checkStock(inventory, "Chocolate");

        printOutOfStock(inventory);
    }

    public static void buyProduct(Map<String, Integer> inventory, String product, int quantity){

        if(!inventory.containsKey(product)){
            System.out.println(product + " is not stocked.");
            return;
        }

        int current = inventory.get(product);
        int updated = current - quantity;

        if(updated <= 0){
            inventory.put(product,0);
            System.out.println(product + " is now OUT OF STOCK!");
        }
        else{
            inventory.put(product, updated);
        }
    }
    public static void restockProduct(Map<String, Integer> inventory,String product, int quantity){
        int current = inventory.getOrDefault(product, 0);
        inventory.put(product, current + quantity);
    }

    public static void checkStock(Map<String, Integer> inventory, String product){

        if(!inventory.containsKey(product)){
            System.out.println(product + ":not stocked");
        }
        else{
            System.out.println(product + "remaining: "+ inventory.get(product));
        }
    }
    public static void printOutOfStock(Map<String, Integer> inventory){
        System.out.println("\nOut of stock products :");
        boolean found = false;

        for(Map.Entry<String, Integer> entry : inventory.entrySet()){
            if(entry.getValue() == 0){
                System.out.println(entry.getKey());
                found= true;
            }
        }
        if(!found){
            System.out.println("None");
        }
    }
}