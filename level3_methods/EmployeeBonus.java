import java.util.Random;

public class EmployeeBonus {

    public static int[][] generateSalaryAndService(int n) {
        int[][] data = new int[n][2];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // Salary 5 digit
            data[i][1] = rand.nextInt(11); // Years of service 0 to 10
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double bonus = data[i][1] > 5 ? data[i][0] * 0.05 : data[i][0] * 0.02;
            result[i][0] = data[i][0] + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displayResults(int[][] data, double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.printf("%-10s%-10s%-10s%-10s\n", "Salary", "Service", "NewSalary", "Bonus");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10d%-10d%-10.2f%-10.2f\n",
                data[i][0], data[i][1], result[i][0], result[i][1]);
            totalOld += data[i][0];
            totalNew += result[i][0];
            totalBonus += result[i][1];
        }
        System.out.printf("Total Old Salary: %.2f\n", totalOld);
        System.out.printf("Total New Salary: %.2f\n", totalNew);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
    }

    public static void main(String[] args) {
        int[][] data = generateSalaryAndService(10);
        double[][] result = calculateNewSalaryAndBonus(data);
        displayResults(data, result);
    }
}
