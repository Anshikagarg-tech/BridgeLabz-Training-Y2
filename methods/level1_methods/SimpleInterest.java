import java.util.Scanner;

public class SimpleInterest {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal, Rate, and Time: ");
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        double si = calculateSimpleInterest(p, r, t);
        System.out.println("The Simple Interest is " + si +
                " for Principal " + p + ", Rate " + r + " and Time " + t);
        sc.close();
    }
}
