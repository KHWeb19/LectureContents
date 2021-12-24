public class Answer4 {
    public static void main(String[] args) {
        final int STAGE = 7;
        final int START = 1;
        final int END = 10;

        // i = i + 7 ===> i += 7 ===> i += STAGE
        for (int i = START; i < END; i++) {
            System.out.printf("%d x %d = %d\n", STAGE, i, STAGE * i);
        }
    }
}
