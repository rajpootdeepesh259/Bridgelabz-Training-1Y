import java.util.*;
class Subject
{
    public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   int phy = sc.nextInt();
	   int chem = sc.nextInt();
	   int math = sc.nextInt();
	   double avg =(phy+chem+math)/3.0;
	   char grade;
	   String remarks;
	   if(avg>=80)
	   {
	   grade ='A';
	   remarks = "Level 4,above agency normalized standards";
	   }
	   else if(avg>=70)
	   {
	   grade ='B';
	   remarks = "Level 3,at agency-normalized standards";
	   }
	   else if(avg>=60)
	   {
	   grade = 'C';
	   remarks = "Level 2,below but approaching agency-normalized standards";
	   }
	   else if(avg>=50)
	   {
	   grade = 'D';
	   remarks ="Level 1,well below agency-normalized standards";
	   }
	   else if(avg>=40)
	   {
	   grade = 'E';
	   remarks = "Level 1-,too below agency-normalized standards";
	   }
	   else
	   {
	   grade ='R';
	   remarks ="Remedial standards";
	   }
	   System.out.println("Average Percentage:" +avg);
	   System.out.println("Grade: "+grade);
	   System.out.println("Remarks: "+remarks);
	}
}