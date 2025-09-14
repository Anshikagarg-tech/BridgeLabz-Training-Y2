import java.util.Random;

public class FootballTeam {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101);
        }
        return heights;
    }

    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int h : heights) if (h < shortest) shortest = h;
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int h : heights) if (h > tallest) tallest = h;
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest: " + findShortest(heights) + " cm");
        System.out.println("Tallest: " + findTallest(heights) + " cm");
        System.out.printf("Mean: %.2f cm\n", calculateMean(heights));
    }
}
