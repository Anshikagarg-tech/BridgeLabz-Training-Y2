import java.util.Scanner;

public class Q8_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (rev == temp) {
            System.out.println(temp + " is a palindrome");
        } else {
            System.out.println(temp + " is not a palindrome");
        }
    }
}
