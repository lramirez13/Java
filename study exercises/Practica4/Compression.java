public class Compression {
    public Compression() {
        super();
    }

    public static void main(String arga[]) {
        System.out.println(compressString("aabcccccaaa"));
        System.out.println(compressString("abc"));
        System.out.println(compressString("aabbcc"));
    }

    public static String compressString(String word) {
        char[] wordArray = word.toCharArray();
        String compressWord = "";
        if (word.length() == 0) {
            return "";
        } else if (word.length() == 1) {
            return word;
        }
        int i = 0;
        int j = 1;
        int count = 1;

        while (j < wordArray.length) {
            if (word.charAt(i) == word.charAt(j)) {
                count++;
            } else {
                compressWord = compressWord + count + word.charAt(i);
                count = 1;
            }
            i = j;
            j++;

            if (j == wordArray.length) {
                compressWord = compressWord + count + word.charAt(i);
            }
        }
        if (compressWord.length() >= word.length()) {
            return word;
        }
        return compressWord;
    }

}
