import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void generateException(String[] names, int index) {
        System.out.println(names[index]); 
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + i + ": ");
            names[i] = sc.nextLine();
        }

        System.out.print("Enter index to access: ");
        int index = sc.nextInt();

        handleException(names, index);
    }
}
