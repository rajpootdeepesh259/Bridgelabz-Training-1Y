import java.util.Scanner;
class Herry
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter birth date : ");
int a = sc.nextInt();
System.out.println("Enter current date: ");
int b = sc.nextInt();
int diff = (b - a);
System.out.println(+diff);


}
}