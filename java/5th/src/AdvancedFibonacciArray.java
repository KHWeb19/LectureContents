import java.util.Scanner;

public class AdvancedFibonacciArray {
    public static void main(String[] args) {
        final int START = 2;

        int[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.print("피보나치 수열의 몇 번째 항을 구할까요 ? ");
        int end = scan.nextInt();

        sequence = new int[end];

        sequence[0] = 1;
        sequence[1] = 1;

        for (int i = START; i < end; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
            System.out.printf("arr[%d] = %d\n", i, sequence[i]);
        }
    }
}
