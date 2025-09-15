import java.util.ArrayList;
import java.util.Scanner;

public class ShortestLongestWord {

    public static String[] splitUsingCharAt(String text) {
        ArrayList<Integer> spaceIndexes = new ArrayList<>();
        spaceIndexes.add(-1);
        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) == ' ') {
                    spaceIndexes.add(i);
                }
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        spaceIndexes.add(text.length());

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

    public static String[] findShortestLongest(String[][] wordArray) {
        String shortest = wordArray[0][0];
        String longest = wordArray[0][0];
        int minLen = Integer.parseInt(wordArray[0][1]);
        int maxLen = Integer.parseInt(wordArray[0][1]);

        for (int i = 1; i < wordArray.length; i++) {
            int len = Integer.parseInt(wordArray[i][1]);
            if (len < minLen) {
                minLen = len;
                shortest = wordArray[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = wordArray[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitUsingCharAt(text);
        String[][] wordArray = getWordsWithLengths(words);
        String[] result = findShortestLongest(wordArray);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
