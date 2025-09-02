import java.util.Scanner;

public class FizzBuzzProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Step 2: Create String array
        String[] results = new String[n + 1]; // including 0

        // Step 3: Loop and assign values
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Step 4: Print results
        for (int i = 0; i <= n; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
