public class Answer7 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int DECISION = 4;
        final int REMAIN = 0;

        int sum = 0;

        for (int i = START; i <= END; i++) {
            if (i % DECISION == REMAIN) {
                System.out.printf("%d의 배수 i = %d\n", DECISION, i);
                sum += i;
            }
        }

        System.out.printf("%d ~ %d까지 %d의 배수들의 합은 %d\n",
                START, END, DECISION, sum);
    }
}
