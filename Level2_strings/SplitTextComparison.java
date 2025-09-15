import java.util.ArrayList;
import java.util.Scanner;

public class SplitTextComparison {

    public static String[] splitUsingCharAt(String text) {
        ArrayList<Integer> spaceIndexes = new ArrayList<>();
        spaceIndexes.add(-1); // for start
        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) == ' ') {
                    spaceIndexes.add(i);
                }
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        spaceIndexes.add(text.length()); // for end

        String[] words = new String[spaceIndexes.size() - 1];
        for (int i = 0; i < words.length; i++) {
            int start = spaceIndexes.get(i) + 1;
            int end = spaceIndexes.get(i + 1);
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] wordsUser = splitUsingCharAt(text);
        String[] wordsBuiltIn = text.split(" ");

        System.out.println("Words using charAt():");
        for (String word : wordsUser) {
            System.out.println(word);
        }

        System.out.println("\nWords using split():");
        for (String word : wordsBuiltIn) {
            System.out.println(word);
        }

        System.out.println("\nAre both arrays equal? " + compareStringArrays(wordsUser, wordsBuiltIn));
    }
}
