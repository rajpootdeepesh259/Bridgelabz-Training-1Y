import java.util.Scanner;
class countdown 
{
public static void main(String arg[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int num = sc.nextInt();
	for(int i=num;i>0;i--){
		System.out.println(i);
	}

}
}	