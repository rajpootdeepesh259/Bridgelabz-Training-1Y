import java.util.Scanner;
class Profit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int costprice = sc.nextInt();
		int sellingprice = sc.nextInt();
		
		int Profit  = (costprice + sellingprice) / 100;
	
		System.out.println(+Profit);
		int Profitpercentage = Profit*100/costprice;
		System.out.println(+Profitpercentage);
	}
}
		