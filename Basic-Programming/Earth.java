import java.util.Scanner;
class Earth
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Radius of earth");
		int radius=sc.nextInt();
		double volume=(4.0/3.0)*3.14*radius*radius*radius;
	System.out.println("vouume of earth"+volume);}
}
