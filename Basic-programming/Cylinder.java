import java.util.Scanner;
class Cylinder
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number : ");
int a = sc.nextInt();
System.out.println("Enter second number : ");
int b = sc.nextInt();
double volume = 3.14*a*a*b ;
System.out.println(+volume);
}
}