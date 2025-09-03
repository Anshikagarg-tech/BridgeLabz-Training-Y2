import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and divisor: ");
        int number = sc.nextInt(), divisor = sc.nextInt();
        int[] qr = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient = " + qr[0] + ", Remainder = " + qr[1]);
        sc.close();
    }
}
