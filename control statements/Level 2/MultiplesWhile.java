import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Enter a valid number.");
        } else {
            int i = 1;
            System.out.println("Multiples of " + number + " below 100 are:");
            while (i < 100) {
                if (i % number == 0)
                    System.out.print(i + " ");
                i++;
            }
        }
        sc.close();
    }
}
