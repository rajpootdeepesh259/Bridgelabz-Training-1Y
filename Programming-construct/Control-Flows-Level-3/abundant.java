import java.util.*;
class abundant
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i,sum=0;
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum>num)
		{
			System.out.println("Abundant Number:");
		}
		else
		{
			System.out.println("Not Abundant Number:");
		}
	}
}
		