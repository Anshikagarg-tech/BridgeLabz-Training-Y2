import java.util.Scanner;

public class Q15_LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        int gcd = a, tempB = b;
        
        while (tempB != 0) {
            int temp = tempB;
            tempB = gcd % tempB;
            gcd = temp;
        }
        
        int lcm = (a * b) / gcd;
        System.out.println("LCM = " + lcm);
    }
}
