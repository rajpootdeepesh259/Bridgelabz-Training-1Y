import java.util.*;
class Harshad
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem,temp,sum=0;
	    temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		if(num%sum==0)
		{
			System.out.println("No is Harshad:");
		}
		else
		{
			System.out.println("No is not Harshad:");
		}
	}
}