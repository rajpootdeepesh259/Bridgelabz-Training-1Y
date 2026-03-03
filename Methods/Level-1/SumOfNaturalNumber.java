import java.util.Scanner;

public class SumOfNaturalNumbers {

    
    public static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = findSum(number);
            System.out.println("Sum of first " + number + " natural numbers is: " + result);
        }

        sc.close();
    }
}