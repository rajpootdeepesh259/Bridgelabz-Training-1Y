import java.util.Scanner;
class Integer
{
	public static void main(String arg[])
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		if(a>0){
				System.out.println("Positive number");
		}
		else if(a<0){
			System.out.println("Negative number");
		}
		else{
			System.out.println("Zero");
		}
		
	}
}	
			
			