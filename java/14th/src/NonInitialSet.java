public class NonInitialSet {
    int equalRatio;

    public NonInitialSet (final int equalRatio) {
        this.equalRatio = equalRatio;
    }

    public int getGeoSeqNthOrderData (final int count) {
        return (int) (Math.pow(equalRatio, count - 1));
    }
}
