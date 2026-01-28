import java.util.Scanner;

class Bonus
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Years of Service: ");
        int years = sc.nextInt();

        double bonus = 0;

        if(years > 5)
        {
            bonus = salary * 0.05;   
            System.out.println("Bonus Amount = " + bonus);
        }
        else
        {
            System.out.println("No Bonus. Service is less than or equal to 5 years.");
        }
    }
}
