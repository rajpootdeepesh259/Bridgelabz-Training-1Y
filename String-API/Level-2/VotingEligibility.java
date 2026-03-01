import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {


    public static int[] generateAges(int n) {

        Random rand = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }

        return ages;
    }

    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote (Invalid Age)";
            } 
            else if (ages[i] >= 18) {
                result[i][1] = "True (Can Vote)";
            } 
            else {
                result[i][1] = "False (Cannot Vote)";
            }
        }

        return result;
    }

    public static void displayResult(String[][] data) {

        System.out.println("\n---------------------------------");
        System.out.println("Student\tAge\tVoting Eligible");
        System.out.println("---------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t" + data[i][0] + "\t" + data[i][1]);
        }

        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);

        String[][] votingStatus = checkVoting(ages);

        displayResult(votingStatus);

        sc.close();
    }
}