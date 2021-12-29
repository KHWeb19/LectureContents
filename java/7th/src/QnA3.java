import java.math.BigInteger;
import java.util.Scanner;

public class QnA3 {
    public static void main(String[] args) {
        final int START = 1;

        BigInteger[] arr;
        Scanner scan = new Scanner(System.in);

        System.out.print("등비 수열 몇 번째 배수를 구할까요 ? ");

        int end = scan.nextInt();
        arr = new BigInteger[end];

        arr[0] = new BigInteger("1");

        for (int i = START; i < end; i++){
            arr[i] = (arr[i - 1].add(arr[i - 1]));

            System.out.printf("[%d] 번째 등비수열의 값 = %d\n", i, arr[i]);
        }
    }
}
