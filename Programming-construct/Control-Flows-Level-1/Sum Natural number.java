import java.util.Scanner;
class Sum Natural number
{
	public static void main(String arg[])
	{
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>0){
			int sumWhileLoop=0;
			int=1;
			while(i<=num){
				sumWhileLoop+=i;
			}
			int sumFormula =(n*(n+1))/2;
			System.out.println("Sum using While Loop: " + sumWhileLoop);
			System.out.println("Sum using formula: " + sumFormula);
			if(sumWhileLoop==sumFormula){
				System.out.println("Both are correct");
			}
			else{
				System.out.println("there are sum error");
			}
		}
	}
}	
			
			