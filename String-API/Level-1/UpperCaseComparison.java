import java.util.Scanner;

public class UpperCaseComparison {

    
    public static String convertToUpperManual(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);  
            }

            result = result + ch;
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String input = sc.nextLine();

        String manualUpper = convertToUpperManual(input);

        String builtInUpper = input.toUpperCase();

        System.out.println("\nManual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);

        boolean result = compareStrings(manualUpper, builtInUpper);

        System.out.println("Are both results equal? " + result);

        sc.close();
    }
}