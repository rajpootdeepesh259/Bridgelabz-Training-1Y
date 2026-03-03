import java.util.Random;

public class EmployeeBonus {
    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2]; 
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            data[i][0] = rand.nextInt(90000) + 10000; 
            data[i][1] = rand.nextInt(10) + 1;       
        }

        return data;
    }
    public static double[][] calculateBonus(int[][] data) {
        int n = data.length;
        double[][] newData = new double[n][2]; 

        for (int i = 0; i < n; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }

        return newData;
    }

    // d. 
    public static void displayBonusReport(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%8d\t%10d\t%5d\t%7.2f\t%10.2f%n", i + 1, oldSalary, years, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("TOTAL\t\t%10.2f\t\t\t%7.2f\t%10.2f%n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

     
        int[][] employeeData = generateEmployeeData(numEmployees);

        
        double[][] newData = calculateBonus(employeeData);

        
        displayBonusReport(employeeData, newData);
    }
}