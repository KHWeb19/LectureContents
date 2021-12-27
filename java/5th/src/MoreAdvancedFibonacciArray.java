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

        // 초항 집어넣을때 아래와 같은 형식으로 넣어줘야 합니다.
        // new BigInteger("집어넣을 숫자") 형식으로 셋팅합니다.
        sequence[0] = new BigInteger("1");
        sequence[1] = new BigInteger("1");

        for (int i = START; i < end; i++) {
            // BigInteger 타입의 변수로 작업해야함
            // 여기서는 sequence이므로 줄여서 seq로 적음
            // seq[i - 1].add(더할 대상)
            // 마찬가지로 더할 대상 또한 BigInteger 타입이어야 합니다.
            sequence[i] = sequence[i - 1].add(sequence[i - 2]);
            System.out.println("arr[" + i + "] = " + sequence[i]);
        }
    }
}
