public class MyCustomSequenceTest {
    public static void main(String[] args) {
        final int ORDER = 31;
        final int ORDER2 = 50;

        MyCustomSequence mcs = new MyCustomSequence(2);

        // 2^0 <<<
        System.out.printf("2^%d = %d\n", ORDER - 1, mcs.getGeoSeqNthOrderData(ORDER));
        System.out.printf("2^%d = %d\n", ORDER2 - 1, mcs.getGeoSeqNthOrderData(ORDER2));
    }
}
