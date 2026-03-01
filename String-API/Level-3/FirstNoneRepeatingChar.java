import java.util.Scanner;

public class FirstNonRepeatingChar {

    
    public static char findFirstNonRepeating(String text) {

        int[] freq = new int[256];
        int len = 0;

     
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // length found
        }

      
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

       
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char firstNonRepeating = findFirstNonRepeating(input);

        if (firstNonRepeating != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}