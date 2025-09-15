import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // Random two-digit age between 10 and 99
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "False";
            } else if (ages[i] >= 18) {
                result[i][1] = "True";
            } else {
                result[i][1] = "False";
            }
        }
        return result;
    }

    public static void displayEligibility(String[][] result) {
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateRandomAges(n);
        String[][] result = checkVotingEligibility(ages);

        displayEligibility(result);
    }
}
