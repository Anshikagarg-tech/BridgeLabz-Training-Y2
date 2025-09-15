import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of persons:");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // [weight, height, bmi]
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            do {
                System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.println("Enter height (m) for person " + (i + 1) + ":");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];
            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n", personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
