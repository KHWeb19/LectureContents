public class QnA1 {
    public static void main(String[] args) {
        // 1 + 4
        // 2 + 8
        // 3 + 12
        // 4 + 16
        // 5 + 20
        // ....
        int cnt = 1, sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0) {
                System.out.printf("sum = %d++ + %d\n", cnt, i);
                sum = cnt++ + i;
                System.out.printf("sum = %d\n", sum);
            }
        }
    }
}
