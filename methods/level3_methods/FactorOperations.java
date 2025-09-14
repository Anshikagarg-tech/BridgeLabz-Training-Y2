import java.util.ArrayList;

public class FactorOperations {

    public static int[] findFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors.add(i);
        }
        int[] result = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) result[i] = factors.get(i);
        return result;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static int productFactors(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }
}
