import java.util.Scanner;

public class CalendarDisplay {

    private static final String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    private static final int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static String getMonthName(int month) {
        return months[month - 1];
    }

    public static int getNumberOfDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDay(int month, int year) {
        int d = 1, m = month, y = year;
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int day = (d + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return ((day + 6) % 7);
    }

    public static void displayCalendar(int month, int year) {
        System.out.println("Calendar for " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDay(month, year);
        for (int i = 0; i < firstDay; i++) System.out.print("    ");
        int days = getNumberOfDays(month, year);
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((d + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        displayCalendar(month, year);
    }
}
