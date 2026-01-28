import java.util.Scanner;
class Vote
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
		System.out.println("enter a number");
		int d = sc.nextInt();
		if(a>=18){
			System.out.println(" a is can Vote");
		}
			else{
				System.out.println("a is can not Vote");
			}
			 if (b>18){
				System.out.println("b is can Vote");
			}
			else{
				System.out.println("b is can not Vote");
			}
			 if (c>18){
				System.out.println("c is can vote");
			else{
				System.out.println(" c is can not Vote");
			}
			 if (d>18){
				System.out.println("d is can Vote");
			}
			else{
				System.out.println(" d is can not Vote");
			}
			
				

		
	}
}