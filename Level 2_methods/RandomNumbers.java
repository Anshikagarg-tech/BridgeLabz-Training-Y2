import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        double[] results = findAverageMinMax(numbers);

        System.out.print("Random numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = 1000 + (int) (Math.random() * 9000);
        }
        return array;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }
}
