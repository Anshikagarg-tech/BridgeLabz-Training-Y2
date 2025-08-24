import java.util.Scanner;

public class Q13_SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Before Swap: a=" + a + ", b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a=" + a + ", b=" + b);
    }
}
