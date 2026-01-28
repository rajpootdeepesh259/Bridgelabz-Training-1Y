import java.util.*;
class BMI
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double height=sc.nextDouble();
		double weight=sc.nextDouble();
		double bmi= weight/(height*height);
		System.out.println("Your Body Mass Index(BMI):");
		if (bmi<=18.4)
		{
			System.out.println("Your BMI status is Underweight:");
		}
		else if(bmi>=18.5 && bmi<=24.9)
		{
			System.out.println("Your BMI status is Normal:");
		}
		else if(bmi>=25.0 && bmi<=39.9)
		{
			System.out.println("Your BMI status is Overweight:");
		}
		else
		{
			System.out.println("Your bmi status is Obese:");
		}
	}
}
		