import java.util.Scanner;
 public class Armstrong number
{
	public static void main(String arg[])
	{
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0){
			System.out.println("Even number");
		}
		else{
			System.out.println("Odd number");
		}
	}
}	