import java.util.Scanner;
class Harry
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter birth year");
		int a=sc.nextInt();
		System.out.println("Enter current year");
		int b=sc.nextInt();
		int c= b-a;
		System.out.println("Age is="+c);
	}
}

		
