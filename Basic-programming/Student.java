import java.util.Scanner;
class Student
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number : ");
int a = sc.nextInt();
System.out.println("Enter second number : ");
int b = sc.nextInt();
int rem = a/b;
System.out.println(+rem);
int que = a%b;
System.out.println(+que);
}
}