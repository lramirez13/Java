
import java.util.Arrays;
import java.util.HashSet;

public class UniqueCharacters {
    public UniqueCharacters() {
        super();
    }

    public static void main(String[] args) {
        System.out.println(uniqueCharacters3("Hello"));
    }

    private static boolean uniqueCharacters(String word) {
        boolean isUnique = true;
        HashSet<Character> wordSet = new HashSet<Character>();
        for (char c : word.toCharArray()) {
            if (wordSet.contains(c)) {
                isUnique = false;
                break;
            } else {
                wordSet.add(c);
            }
        }
        return isUnique;
    }


    private static boolean uniqueCharacters2(String word) {
        boolean isUnique = true;
        char[] wordArray = word.toCharArray();
        Arrays.sort(wordArray);
        for (int i = 0; i < wordArray.length - 1; i++) {
            if (wordArray[i] == wordArray[i + 1]) {
                return false;
            }
        }
        return isUnique;
    }

    private static boolean uniqueCharacters3(String word) {
        HashSet<Character> wordSet = new HashSet<Character>();
        char[] wordArray = word.toCharArray();
        for (char c : wordArray) {
            wordSet.add(c);
        }
        return wordSet.size() == wordArray.length;
    }    
}
