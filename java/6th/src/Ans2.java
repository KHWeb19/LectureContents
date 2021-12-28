import java.math.BigInteger;
import java.util.Scanner;

public class Ans2 {
    public static void main(String[] args) {
        /*  1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
            BigInteger를 통해서 50번째 항을 구해보자! */

        final int START_IDX = 0;
        final BigInteger BASE = new BigInteger("2");

        System.out.print("찾고자하는 수열의 항을 입력해주세요: ");

        Scanner scan = new Scanner(System.in);
        int idx = scan.nextInt();

        BigInteger[] seq = new BigInteger[idx];
        seq[START_IDX] = new BigInteger("1");

        for (int i = START_IDX + 1; i < idx; i++) {
            seq[i] = seq[i - 1].multiply(BASE);
            System.out.println("seq[" + i + "] = " + seq[i]);
        }
    }
}
