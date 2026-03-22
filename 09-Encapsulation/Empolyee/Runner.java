package com.abstraction;

public class Runner {
public static void main(String[] args) {

Employee p1=new PartTimeEmployee("CS","Loknath",101,0);
p1.displayinfo();
System.out.println("Paid to part Time Employee :- ");
double paidToEmployee=p1.salarycalculation(+6,1000);
System.out.println(paidToEmployee);
System.out.println("------------------------------------------------");
PartTimeEmployee p2=new PartTimeEmployee("CS","Loknath",101,0);
double paid=p2.salarycalculation(3,300);
p2.displayinfo();
System.out.println(paid);
}
}