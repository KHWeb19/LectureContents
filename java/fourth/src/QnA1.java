public class QnA1 {
    public static void main(String[] args) {
        // 1 + 4
        // 2 + 8
        // 3 + 12
        // 4 + 16
        // 5 + 20
        // ....
        final int START = 1;
        final int END = 100;
        final int DECISION = 4;
        final int REMAIN = 0;

        int cnt = START, sum = 0;

        for (int i = START; i <= END; i++) {
            if (i % DECISION == REMAIN) {
                System.out.printf("sum = %d++ + %d\n", cnt, i);
                sum = cnt++ + i;
                System.out.printf("sum = %d\n", sum);
            }
        }
    }
}
