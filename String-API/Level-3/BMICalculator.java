import java.util.Scanner;

public class BMICalculator {

    
    public static String[][] calculateBMI(double[][] hwData) {

        int n = hwData.length;
        String[][] result = new String[n][4];

        for (int i = 0; i < n; i++) {

            double weight = hwData[i][0]; 
            double heightCm = hwData[i][1]; 
            double heightM = heightCm / 100.0; 

            double bmi = weight / (heightM * heightM);
            double bmiRounded = Math.round(bmi * 100.0) / 100.0; 

            String status;
            if (bmiRounded < 18.5) {
                status = "Underweight";
            } else if (bmiRounded < 25) {
                status = "Normal";
            } else if (bmiRounded < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmiRounded);
            result[i][3] = status;
        }

        return result;
    }

  
    public static void displayBMI(String[][] data) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t" + data[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int members = 10;
        double[][] hwData = new double[members][2]; 

        
        for (int i = 0; i < members; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            hwData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            hwData[i][1] = sc.nextDouble();
        }

        
        String[][] bmiResults = calculateBMI(hwData);

      
        displayBMI(bmiResults);

        sc.close();
    }
}