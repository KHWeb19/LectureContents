import java.math.BigInteger;

import static java.math.BigInteger.*;

public class BigMath {
    static int arrLength;
    static BigInteger bigNum;
    // 유틸리티 매서드란!!!
    // Math.random() <<< 여기서 이상한점이 뭘까요 ?
    static public int log10 (BigInteger num) {
        bigNum = num;
        BigInteger mantissa = ZERO;
        BigInteger n = num.divide(TEN);

        int tmp;

        while (n.compareTo(ZERO) == 1) {
            n = n.divide(TEN);
            mantissa = mantissa.add(ONE);
        }

        tmp = mantissa.intValue();
        arrLength = tmp + 1;

        return tmp;
    }

    static public void bigLocationCheck () {
        int[] numArr = new int[arrLength];

        for (int i = arrLength - 1; i >= 0; i--) {
            numArr[i] = bigNum.divide(
                    new BigInteger(
                            String.valueOf(
                                    //Math.pow(BASE, i)
                                    TEN.pow(i)
                            )
                    )
            ).mod(
                    TEN
            ).intValue();

            System.out.printf("numArr[%d] = %d\n", i, numArr[i]);
        }

        System.out.println("실제 집어넣은 값: " + bigNum);
    }
}
