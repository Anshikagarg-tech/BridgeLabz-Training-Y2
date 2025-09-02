import java.util.Scanner;

public class FactorsProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxFactor = 10;                 // initial size of array
        int[] factors = new int[maxFactor]; // array to store factors
        int index = 0;                      // to track position

        // Step 2: Find factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) { // i is a factor
                // If array is full, increase size
                if (index == maxFactor) {
                    maxFactor *= 2; // double the size
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // assign back
                }
                factors[index++] = i; // store factor
            }
        }

        // Step 3: Display factors
        System.out.print("Factors of " + num + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
