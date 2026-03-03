import java.util.Scanner;

public class SumNaturalNumbers {

   
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

     
        if (number <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {

            int recursiveResult = sumRecursive(number);
            int formulaResult = sumFormula(number);

            System.out.println("Sum using recursion: " + recursiveResult);
            System.out.println("Sum using formula: " + formulaResult);

          
            if (recursiveResult == formulaResult) {
                System.out.println("Both results are correct and equal.");
            } else {
                System.out.println("Results are NOT equal.");
            }
        }

        sc.close();
    }
}