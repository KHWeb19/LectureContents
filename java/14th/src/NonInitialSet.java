import java.math.BigInteger;

public class NonInitialSet {
    int equalRatio;

    public NonInitialSet (final int equalRatio) {
        this.equalRatio = equalRatio;
    }

    public BigInteger getGeoSeqNthOrderData (final int count) {
        // 디버깅용(값이 올바르게 나오나 체크)
        for (int i = 0; i < count; i++) {
            System.out.printf("%d^%d = %d\n", equalRatio, i,
                    BigInteger.valueOf(equalRatio).pow(i));
        }

        return BigInteger.valueOf(equalRatio).pow(count - 1);
    }
}
