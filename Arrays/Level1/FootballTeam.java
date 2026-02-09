import java.util.Scanner;
class FootballTeam{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double[] height=new double[11];
		double sum=0;
		System.out.println("enter a height of 11 player in the football");
		for(int i=0;i<11;i++){

			height[i]=sc.nextDouble();
			sum += height[i];
		}
		double mean = sum/11;
		System.out.println("The mean height of the football team is: " +mean);
		sc.close();
	}
}

				
			