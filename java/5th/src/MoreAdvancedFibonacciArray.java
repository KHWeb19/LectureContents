import java.math.BigInteger;
import java.util.Scanner;

public class MoreAdvancedFibonacciArray {
    public static void main(String[] args) {
        final int START = 2;

        BigInteger[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.print("피보나치 수열의 몇 번째 항을 구할까요 ? ");
        int end = scan.nextInt();

        sequence = new BigInteger[end];

        sequence[0] = new BigInteger("1");
        sequence[1] = new BigInteger("1");

        for (int i = START; i < end; i++) {
            sequence[i] = sequence[i - 1].add(sequence[i - 2]);
            System.out.println("arr[" + i + "] = " + sequence[i]);
        }
    }
}
