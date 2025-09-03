import java.util.Scanner;

public class TriangularPark {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 km = 5000 meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of triangle: ");
        double s1 = sc.nextDouble(), s2 = sc.nextDouble(), s3 = sc.nextDouble();
        System.out.println("Rounds required = " + calculateRounds(s1, s2, s3));
        sc.close();
    }
}
