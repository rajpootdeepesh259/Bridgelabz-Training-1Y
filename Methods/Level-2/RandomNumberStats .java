public class RandomNumberStats {

    public int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
           
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    public double[] findAverageMinMax(int[] numbers) {

        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        RandomNumberStats obj = new RandomNumberStats();

        int[] randomNumbers = obj.generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit random numbers:");

        for (int num : randomNumbers) {
            System.out.println(num);
        }

        double[] results = obj.findAverageMinMax(randomNumbers);

        System.out.println("\nResults:");
        System.out.println("Average = " + results[0]);
        System.out.println("Minimum = " + (int)results[1]);
        System.out.println("Maximum = " + (int)results[2]);
    }
}