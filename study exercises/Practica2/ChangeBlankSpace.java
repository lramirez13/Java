public class ChangeBlankSpace {
    public ChangeBlankSpace() {
        super();
    }

    public static void main(String[] args) {
    changeBlankSpace("Hello World");
    }

    private static void changeBlankSpace(String text) {
        char[] textArray = text.toCharArray();
        for (char c : textArray) {
            if (Character.isWhitespace(c)) {
                System.out.print("%20");
            } else {
                System.out.print(c);
            }

        }
    }
}
