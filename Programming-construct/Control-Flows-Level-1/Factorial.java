import java.util.Scanner;
 public class Factorial
{
	public static void main(String arg[])
	{
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<0){
		System.out.println("Factorial is not defined for negative number");
		}
		else{
		long factorial = 1;
		int i=1;
		while (i<=num){
		factorial *= i;
		i++;
		}
		System.out.println("the factorial of " +num+ "is:" +factorial);
		}
	}
}	
		