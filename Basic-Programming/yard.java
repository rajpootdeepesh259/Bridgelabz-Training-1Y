import java.util.Scanner;

class yard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        int feet = sc.nextInt();

        int yards = feet / 3;
        int miles = yards / 1760;

        System.out.println("Distance in feet is " + feet +
                           " while in yards is " + yards +
                           " and in miles is " + miles);
    }
}
