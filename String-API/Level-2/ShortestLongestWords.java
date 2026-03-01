import java.util.Scanner;

public class ShortestLongestWords {

   
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

  
    public static String[] splitTextIntoWords(String text) {

        String[] temp = new String[100];
        int wordIndex = 0;
        String word = "";

        for (int i = 0; i < findLength(text); i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {      
                word += ch;
            } else if (!word.equals("")) { 
                temp[wordIndex++] = word;
                word = "";
            }
        }

        
        if (!word.equals("")) {
            temp[wordIndex++] = word;
        }

  
        String[] words = new String[wordIndex];
        for (int i = 0; i < wordIndex; i++) {
            words[i] = temp[i];
        }

        return words;
    }

 
    public static String[][] wordLengths(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

 
    public static int[] findShortestLongest(String[][] wordData) {

        int minIndex = 0;
        int maxIndex = 0;

        int minLength = Integer.parseInt(wordData[0][1]);
        int maxLength = Integer.parseInt(wordData[0][1]);

        for (int i = 1; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);
            if (len < minLength) {
                minLength = len;
                minIndex = i;
            }
            if (len > maxLength) {
                maxLength = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        String[] words = splitTextIntoWords(input);
        String[][] wordData = wordLengths(words);

    
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < wordData.length; i++) {
            System.out.println(wordData[i][0] + "\t" + wordData[i][1]);
        }

      
        int[] indices = findShortestLongest(wordData);

        System.out.println("\nShortest word: " + wordData[indices[0]][0] +
                           " (Length: " + wordData[indices[0]][1] + ")");
        System.out.println("Longest word: " + wordData[indices[1]][0] +
                           " (Length: " + wordData[indices[1]][1] + ")");

        sc.close();
    }
}