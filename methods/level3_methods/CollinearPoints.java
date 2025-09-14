import java.util.Scanner;

public class CollinearPoints {

    public static boolean isCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (y2 - y1) / (double)(x2 - x1);
        double slopeBC = (y3 - y2) / (double)(x3 - x2);
        double slopeAC = (y3 - y1) / (double)(x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public static boolean isCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        System.out.println("Enter coordinates of 3 points (x y):");
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        if (isCollinearUsingSlope(x[0], y[0], x[1], y[1], x[2], y[2]))
            System.out.println("Points are collinear using slope formula.");
        else
            System.out.println("Points are not collinear using slope formula.");

        if (isCollinearUsingArea(x[0], y[0], x[1], y[1], x[2], y[2]))
            System.out.println("Points are collinear using area formula.");
        else
            System.out.println("Points are not collinear using area formula.");
    }
}
