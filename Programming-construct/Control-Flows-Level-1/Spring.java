import java.util.Scanner;
class Spring
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int day = sc.nextInt();
		System.out.println("enter a day");
		int month = sc.nextInt();
		System.out.println("enter a month");
		if(day>=20&&month==3)||(month==4)||(month==5)||(day<=20 && month==6)
		{
			System.out.println(" Spring season");
		}

			 
			else{
				System.out.println("not Spring season");
			}
	}
}	