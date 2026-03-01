import java.util.Scanner;

public class SubstringComparison {

    public static String createSubstring(String str, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += str.charAt(i);
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

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String substringByCharAt = createSubstring(text, start, end);

        String substringByMethod = text.substring(start, end);

        boolean comparisonResult = compareStrings(substringByCharAt, substringByMethod);

        System.out.println("Substring using charAt(): " + substringByCharAt);
        System.out.println("Substring using substring(): " + substringByMethod);
        System.out.println("Are both substrings equal? " + comparisonResult);

        scanner.close();
    }
}
