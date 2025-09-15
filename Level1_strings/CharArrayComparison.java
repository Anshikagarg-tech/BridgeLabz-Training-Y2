import java.util.Scanner;

public class CharArrayComparison {

    public static char[] getChars(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] chars1 = getChars(text);
        char[] chars2 = text.toCharArray();

        System.out.println("User-defined method result: " + new String(chars1));
        System.out.println("Built-in toCharArray() result: " + new String(chars2));
        System.out.println("Are both arrays equal? " + compareCharArrays(chars1, chars2));
    }
}
