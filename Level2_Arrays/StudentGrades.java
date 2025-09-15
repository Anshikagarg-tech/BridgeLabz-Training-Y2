import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int number = sc.nextInt();

        int[][] marks = new int[number][3]; // physics, chemistry, maths
        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.println("Enter marks for " + subject + " for student " + (i + 1) + ":");
                    marks[i][j] = sc.nextInt();
                    if (marks[i][j] < 0 || marks[i][j] > 100)
                        System.out.println("Invalid marks. Enter between 0 and 100.");
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 90)
                grade[i] = "A";
            else if (percentage[i] >= 80)
                grade[i] = "B";
            else if (percentage[i] >= 70)
                grade[i] = "C";
            else if (percentage[i] >= 60)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        System.out.println("Marks in Physics, Chemistry, Maths, Percentage, Grade:");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%d\t%d\t%.2f\t%s%n", marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
    }
}
