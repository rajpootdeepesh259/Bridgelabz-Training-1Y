import java.util.Scanner;
public class NumberAnalysis
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int [] numbers = new int [5];
		System.out.println("enter a number: ");
		for(int i=0;i<5;i++)
		{
			numbers[i] = Scanner.nextInt();
		}
		for (int number : numbers){
			if(number>0){
				if(number%2==0){
				System.out.println(number + "is positive and even");
				else{
					System.out.println(number + "is positive and odd");
				else if (number<0){
					System.out.println(number + "is negative and even");
					else{
						System.out.println(number +"is zero");
					}
				}
				
				
					
			
		
	}
}