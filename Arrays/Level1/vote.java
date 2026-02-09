import java.util.Scanner;
public class Vote
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int [] ages = new int [5];
		System.out.println("enter a number: ");
		for(int i=0;i<ages.length;i++)
		{
			System.out.println("Student" + (i+1) + "age" );
			if(ages[i]<=18)
			{
				System.out.println("Eligible");
			}
		}
	}
}