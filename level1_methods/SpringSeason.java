import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) ||
                (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and day: ");
        int month = sc.nextInt(), day = sc.nextInt();
        System.out.println(isSpringSeason(month, day) ? "Its a Spring Season" : "Not a Spring Season");
        sc.close();
    }
}
