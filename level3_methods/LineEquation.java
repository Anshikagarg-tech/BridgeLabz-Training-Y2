import java.util.Scanner;

public class LineEquation {

    public static double findDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }

    public static double[] findEquation(int x1, int y1, int x2, int y2) {
        double slope = (y2 - y1) / (double)(x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter points x1 y1 x2 y2:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double distance = findDistance(x1, y1, x2, y2);
        double[] equation = findEquation(x1, y1, x2, y2);
        System.out.printf("Distance: %.2f\n", distance);
        System.out.printf("Equation: y = %.2fx + %.2f\n", equation[0], equation[1]);
    }
}
