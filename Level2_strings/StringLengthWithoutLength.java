import java.util.Scanner;

public class StringLengthWithoutLength {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.next();
        
        int lengthUser = findLength(text);
        int lengthBuiltIn = text.length();

        System.out.println("Length using user-defined method: " + lengthUser);
        System.out.println("Length using built-in method: " + lengthBuiltIn);
    }
}
