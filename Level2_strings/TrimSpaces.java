import java.util.Scanner;

public class TrimSpaces {

    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        try {
            while (text.charAt(start) == ' ') {
                start++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            start = text.length();
        }

        try {
            while (text.charAt(end) == ' ') {
                end--;
            }
        } catch (StringIndexOutOfBoundsException e) {
            end = -1;
        }

        return new int[]{start, end + 1};
    }

    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String trimmed = substringUsingCharAt(text, indexes[0], indexes[1]);
        String builtInTrim = text.trim();

        System.out.println("Trimmed using charAt(): " + trimmed);
        System.out.println("Trimmed using trim(): " + builtInTrim);
        System.out.println("Are they equal? " + compareStrings(trimmed, builtInTrim));
    }
}
