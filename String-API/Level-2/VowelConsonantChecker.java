import java.util.Scanner;

public class VowelConsonantChecker {

    public static String checkCharacterType(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);   
        }
        
        if (ch >= 'a' && ch <= 'z') {

           
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } 
            else {
                return "Consonant";
            }
        } 
        else {
            return "Not a Letter";
        }
    }

    public static String[][] analyzeString(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    public static void displayResult(String[][] data) {

        System.out.println("\n--------------------------------");
        System.out.println("Character\tType");
        System.out.println("--------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }

        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] analysis = analyzeString(input);

        displayResult(analysis);

        sc.close();
    }
}