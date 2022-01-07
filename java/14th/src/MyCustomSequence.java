public class MyCustomSequence {
    InitialSet is;
    NonInitialSet nis;

    public MyCustomSequence (final int[] arr, int bias) {
        is = new InitialSet(arr, bias);
    }
    public MyCustomSequence (final int[] arr, int bias, int jumping) {
        is = new InitialSet(arr, bias, jumping);
    }

    public MyCustomSequence (final int equalRatio) {
        nis = new NonInitialSet(equalRatio);
    }

    public int getNthOrderData (int count) {
        return is.getNthOrderData(count);
    }

    public int getGeoSeqNthOrderData (int count) {
        return nis.getGeoSeqNthOrderData(count);
    }
}
