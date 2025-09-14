import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();

        // Ensure Gregorian Calendar
        if (year < 1582) {
            System.out.println("Leap year calculation only works for year >= 1582");
        } else {
            // ---- Part 1: Multiple if else ----
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }

            // ---- Part 2: Single if with && and || ----
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("(Logical check) " + year + " is a Leap Year");
            } else {
                System.out.println("(Logical check) " + year + " is NOT a Leap Year");
            }
        }
        sc.close();
    }
}
