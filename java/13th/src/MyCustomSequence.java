public class MyCustomSequence {
    InitialSet is;

    public MyCustomSequence (final int[] arr, int bias) {
        is = new InitialSet(arr, bias);
    }
    public MyCustomSequence (final int[] arr, int bias, int jumping) {
        is = new InitialSet(arr, bias, jumping);
    }

    public int getNthOrderData (int count) {
        return is.getNthOrderData(count);
    }
}
