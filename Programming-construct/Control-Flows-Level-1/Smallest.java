import java.util.Scanner;
class Smallest
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("enter a number");
		int b = sc.nextInt();
		System.out.println("enter a number");
		int c = sc.nextInt();
		if(a<b&&a<c){
			System.out.println(" a is Smallest");
			}
		else if (b>a&&b>c){
			System.out.println(" b is Greater");
		}
		else if (c>a&&c>b){
			System.out.println(" c is Greater");
		}
		else{
			System.out.println(" no one is Greater");
		}
			
		
			
		

		
	}
}