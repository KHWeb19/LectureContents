public class FibonacciArray {
    public static void main(String[] args) {
        final int MAX = 100;
        final int START = 2;
        final int END = 20;

        int[] arr = new int[MAX];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = START; i < END; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
