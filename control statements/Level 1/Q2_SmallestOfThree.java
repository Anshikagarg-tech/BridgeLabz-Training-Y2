import java.util.Scanner;

public class Q2_SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int smallest = (a < b && a < c) ? a : (b < c ? b : c);
        System.out.println("Smallest number is: " + smallest);
    }
}
