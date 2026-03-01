import java.util.Scanner;

public class StringIndexOutOfBounds {

   
    public static void generateException(String str) {
        System.out.println("\nInside generateException() method");
        
        char ch = str.charAt(str.length());  
       
        
        System.out.println("Character: " + ch);
    }


    public static void handleException(String str) {
        System.out.println("\nInside handleException() method");

        try {
            
            char ch = str.charAt(str.length());
            System.out.println("Character: " + ch);
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Caught Successfully!");
            System.out.println("Error Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        try {
            generateException(input);
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("\nRuntime Exception occurred in generateException()");
        }

        handleException(input);

        sc.close();
    }
}