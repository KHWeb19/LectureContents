public class Answer5 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int DECISION = 2;
        final int REMAIN = 0;

        for (int i = START; i <= END; i++) {
            if (i % DECISION == REMAIN) {
                System.out.println("짝수 i = " + i);
            }
        }
    }
}
