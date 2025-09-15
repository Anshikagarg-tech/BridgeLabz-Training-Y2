import java.util.ArrayList;
import java.util.Scanner;

public class WordLengthArray {

    public static String[] splitUsingCharAt(String text) {
        ArrayList<Integer> spaceIndexes = new ArrayList<>();
        spaceIndexes.add(-1); // start index
        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) == ' ') {
                    spaceIndexes.add(i);
                }
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        spaceIndexes.add(text.length()); // end index

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

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitUsingCharAt(text);
        String[][] result = getWordsWithLengths(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
        }
    }
}