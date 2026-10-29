import java.util.Scanner;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {

        System.out.println("/n --------------------------WELCOME TO MY PROJECT---------------------------------------");
        System.out.println("1.Addition ");
        System.out.println("2.Sub ");
        System.out.println("3.Mul ");
        System.out.println("4.Div  ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num1 :- ");
        int a = sc.nextInt();
        System.out.println("Enter your num2 :- ");
        int b = sc.nextInt();
        Calculator c1 = new Calculator();
        while (true){

            int choice = sc.nextInt();
        switch (choice) {

            case 1:
                int addition = c1.add(a, b);
                System.out.println("Addition of two Numbers :- " + addition);
                break;

            case 2:
                int subtraction = c1.sub(a, b);
                System.out.println("Substraction of two Numbers :- " + subtraction);
                break;

            case 3:
                int multiplication = c1.mul(a, b);
                System.out.println("Multiplication of two Numbers :- " + multiplication);
                break;

            case 4:
                int division = c1.div(a, b);
                System.out.println("Division of two Numbers :- " + division);
                break;

            default:
                System.out.println("Invalid");
                break;
        }
    }
    }
}