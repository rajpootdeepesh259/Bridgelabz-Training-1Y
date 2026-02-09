import java.util.Scanner;
public class FizzBuzz
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		if(number<0){
			System.out.println("Invalid");
		}
	String result[] = new int [number];
	
	for(int i=0;i<number;i++){
		if(i%3==0&&i%5==0)
	result[i]="FizzBuzz";
else if (i%3==0){
	result[i+1]="Fizz";
}
else if (i%5==0){
	result[i+1]="Buzz";
}
else{
	result[i]=String.valueof(i);
}
	}
	}
}

	
	
	