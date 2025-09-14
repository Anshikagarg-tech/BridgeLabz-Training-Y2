import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length;
        int sumLength = A[0].length;
        int[][] result = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                for(int k=0;k<sumLength;k++){
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for(int[] row : matrix){
            for(int val : row){
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.print("Enter rows and columns for matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        if(c1 != r2){
            System.out.println("Matrix multiplication not possible.");
            return;
        }
        int[][] A = createRandomMatrix(r1, c1);
        int[][] B = createRandomMatrix(r2, c2);
        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("Matrix B:");
        displayMatrix(B);
        System.out.println("Addition:");
        displayMatrix(addMatrix(A, B));
        System.out.println("Subtraction:");
        displayMatrix(subtractMatrix(A, B));
        System.out.println("Multiplication:");
        displayMatrix(multiplyMatrix(A, B));
    }
}
