import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of persons:");
        int number = sc.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            do {
                System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
                weight[i] = sc.nextDouble();
            } while (weight[i] <= 0);

            do {
                System.out.println("Enter height (m) for person " + (i + 1) + ":");
                height[i] = sc.nextDouble();
            } while (height[i] <= 0);

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n", height[i], weight[i], bmi[i], status[i]);
        }
    }
}
