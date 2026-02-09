import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int tempNumber = number;

       
        int count = 0;
        while (tempNumber != 0) {
            count++;
            tempNumber /= 10;
        }

       
        int[] digits = new int[count];
        tempNumber = number;  
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

     
        System.out.println("\nDigit\tFrequency");
        System.out.println(" ");
        for (int i = 0; i <= 9; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + "\t" + frequency[i]);
            }
        }

        sc.close();
    }
}
