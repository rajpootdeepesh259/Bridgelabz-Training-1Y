import java.util.Scanner;
 public class Factorial2
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
        for(int i=1;i<=num;++i){
		factorial *= i;
		}
		System.out.println("the factorial of " +num+ "is:" +factorial);
		}
	}
}	
		