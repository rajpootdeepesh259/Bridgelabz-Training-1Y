
class MobilePhone {
   
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {

        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 14", 999.99);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 849.50);

        phone1.displayDetails();
        phone2.displayDetails();
    }
}