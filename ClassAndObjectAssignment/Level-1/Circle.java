
class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    void display() {
        System.out.println("Circle with radius: " + radius);
        System.out.printf("Area: %.2f\n", calculateArea());
        System.out.printf("Circumference: %.2f\n", calculateCircumference());
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7.5);

        circle1.display();
        circle2.display();
    }
}