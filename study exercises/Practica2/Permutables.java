import java.util.Arrays;

public class Permutables {
    public Permutables() {
        super();
    }

    public static void main(String[] args) {
        System.out.println(permutables("hello", "hlloe"));
    }

    private static boolean permutables(String textA, String textB) {
        char[] textArrayA = textA.toCharArray();
        char[] textArrayB = textB.toCharArray();
        Arrays.sort(textArrayA);
        Arrays.sort(textArrayB);
        return Arrays.equals(textArrayA, textArrayB);
    }
}
