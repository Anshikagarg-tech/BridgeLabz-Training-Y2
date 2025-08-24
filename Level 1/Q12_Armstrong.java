import java.util.Scanner;

public class Q12_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, temp = num, digits = 0;
        
        int n = num;
        while (n > 0) {
            digits++;
            n /= 10;
        }
        
        n = num;
        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, digits);
            n /= 10;
        }
        
        if (sum == temp) {
            System.out.println(temp + " is an Armstrong number");
        } else {
            System.out.println(temp + " is not an Armstrong number");
        }
    }
}
