public class Answer6 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int DECISION = 3;
        final int REMAIN = 0;

        for (int i = START; i <= END; i++) {
            if (i % DECISION == REMAIN) {
                System.out.println("3의 배수 i = " + i);
            }
        }
    }
}
