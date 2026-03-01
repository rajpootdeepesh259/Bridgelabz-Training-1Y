import java.util.Scanner;

public class StringIndex {


    public static void generateException(String str) {
        System.out.println("\nGenerating Exception...");
        
        char ch = str.charAt(str.length());  

        System.out.println("Character: " + ch);
    }
    public static void handleException(String str) {
        System.out.println("\nHandling Exception with try-catch...");
        
        try {
           
            char ch = str.charAt(str.length());
            System.out.println("Character: " + ch);
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
            System.out.println("You are trying to access an index beyond the string length.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = scanner.nextLine();


        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Program stopped due to: " + e);
        }

        handleException(input);

        scanner.close();
    }
}