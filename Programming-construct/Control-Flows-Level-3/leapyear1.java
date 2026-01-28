import java.util.*;
public class leapyear1{
    public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter your year");
	   int year=sc.nextInt();
	   if(year%4==0){
	       System.out.println("leap year");
		}
		else if(year%400==0){
		     System.out.println("leap year");
		}else if(year%100==0){
		     System.out.println("not a leap year");
		}
	}
}