import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        
        double[][] marks = new double[n][3]; 
        double[] percentage = new double[n];
        String[] grade = new String[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextDouble();
        }

       
        for (int i = 0; i < n; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (totalMarks / 300) * 100; 

            
            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 75) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else {
                grade[i] = "F";
            }
        }

       
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f\t\t%s\n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]);
        }

        sc.close();
    }
}
