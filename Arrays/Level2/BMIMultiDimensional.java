import java.util.Scanner;

public class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        
        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];

        
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            
            while (true) {
                System.out.print("Weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] > 0) break;
                System.out.println("Invalid input! Weight must be positive.");
            }

           
            while (true) {
                System.out.print("Height (m): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] > 0) break;
                System.out.println("Invalid input! Height must be positive.");
            }
        }

        
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            
            personData[i][2] = weight / (height * height);

            double bmi = personData[i][2];

            
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        
        System.out.println("\nPerson\tWeight(kg)\tHeight(m)\tBMI\t\tStatus");
        System.out.println(" ");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1),
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]);
        }

        sc.close();
    }
}
