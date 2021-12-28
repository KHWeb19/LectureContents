public class Ans9 {
    public static void main(String[] args) {
        final int MAX = 25;
        final int START = 3;

        int[] seq = new int[MAX];

        seq[0] = 1;
        seq[1] = 1;
        seq[2] = 1;

        for (int i = START; i < MAX; i++) {
            seq[i] = seq[i - 3] + seq[i - 1];
            System.out.printf("seq[%d] = %d\n", i + 1, seq[i]);
        }
    }
}
