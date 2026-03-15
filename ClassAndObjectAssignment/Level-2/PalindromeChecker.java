
class PalindromeChecker {
    
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }
    boolean isPalindrome() {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase(); 
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        
        PalindromeChecker checker1 = new PalindromeChecker("Racecar");
        PalindromeChecker checker2 = new PalindromeChecker("Hello World");

        checker1.displayResult();
        checker2.displayResult();
    }
}