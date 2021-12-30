public class QnA3 {
    public static void main(String[] args) {

        final int START = 2;
        final int MAX = 5;

        int[] arr = new int[MAX];

        arr[0] = 1;
        arr[1] = 2;

        for (int i = START; i < 5; i++) {
            arr[i] = arr[i - 1] + arr[i - 1];
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
