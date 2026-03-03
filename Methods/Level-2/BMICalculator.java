import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];        
            double heightCm = data[i][1];      

            double heightMeter = heightCm / 100.0;   

            double bmi = weight / (heightMeter * heightMeter);

            data[i][2] = bmi;   
        }
    }

    
    public static String getBMIStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        double[][] persons = new double[10][3];

        
        for (int i = 0; i < persons.length; i++) {

            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            persons[i][0] = scanner.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = scanner.nextDouble();
        }

        
        calculateBMI(persons);

        
        System.out.println("\n--- BMI Report ---");

        for (int i = 0; i < persons.length; i++) {

            double weight = persons[i][0];
            double height = persons[i][1];
            double bmi = persons[i][2];

            String status = getBMIStatus(bmi);

            System.out.printf("Person %d -> Height: %.2f cm, Weight: %.2f kg, BMI: %.2f, Status: %s%n",
                    (i + 1), height, weight, bmi, status);
        }

        scanner.close();
    }
}