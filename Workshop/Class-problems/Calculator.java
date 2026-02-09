class Calculator
{
public int add(int a, int b)
{
return a+b ;
}
public int sub(int a, int b)
{
return a-b ;
}
public int div(int a, int b)
{
return a/b ;
}
public int mul(int a, int b)
{
return a*b ;
}
public static void main(String []args)
{	
Scanner sc=new Scanner(System.in);
System.out.println("enter a num1:-");
System.out.println("enter a num2:-");
int a =sc.nextInt();
int b =sc.nextInt();
Calculator cal = new Calculator();
int choice= sc.nextInt();
switch (choice){
    case 1:
int addition = cal.add(a,b);
System.out.println("Addition of two number:- " +addition);
break;
case 2:
int subtraction=cal.sub(a,b);
System.out.println("Subtracting of two number:- " +subtraction);
break;
case 3:
int division=cal.div(a,b);
System.out.println("Division of two number:- " +division);
break;
case 4:
int multiplication=cal.mul(a,b);
System.out.println("Multiplication of two number:- " +multiplication);
break;
}
}
}


