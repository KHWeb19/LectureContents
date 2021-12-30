import java.math.BigInteger;
import java.util.Scanner;

public class QnA2 {
    public static void main(String[] args) {
        final int START = 0;

        BigInteger[] arr;
        Scanner sc = new Scanner(System.in);

        System.out.print("몇번째 배수 ? ");
        int end = sc.nextInt();

        arr = new BigInteger[end];

        for (int i = START; i < end; i++){
            arr[i] = BigInteger.valueOf((int)(Math.pow(2,i)));

            System.out.println("arr[" +i+ "] = "+arr[i]);
        }
    }
}
