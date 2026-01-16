import java.util.Scanner;
class Convert
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number : ");
int a = sc.nextInt();
double inch = a*(12);
double cm = inch* (2.54);
System.out.println(inch);
System.out.println(cm);
}
}