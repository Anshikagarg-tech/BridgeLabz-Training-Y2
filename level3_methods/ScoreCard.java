import java.util.Random;
import java.util.Scanner;

public class ScoreCard {

    public static int[][] generatePCM(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = 10 + rand.nextInt(90);
            scores[i][1] = 10 + rand.nextInt(90);
            scores[i][2] = 10 + rand.nextInt(90);
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            results[i][0] = total;
            results[i][1] = Math.round((total / 3.0) * 100.0) / 100.0;
            results[i][2] = Math.round((total / 300.0 * 100) * 100.0) / 100.0;
        }
        return results;
    }

    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.printf("Physics\tChemistry\tMaths\tTotal\tAverage\tPercentage\n");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t%d\t%.2f\t%.2f\n",
                scores[i][0], scores[i][1], scores[i][2], (int)results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] scores = generatePCM(n);
        double[][] results = calculateResults(scores);
        displayScoreCard(scores, results);
    }
}
