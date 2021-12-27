public class RandomArrayIndex {
    public static void main(String[] args) {
        final int ARRMAX = 100;
        final int MAX = 100;
        final int MIN = 50;

        int range = MAX - MIN + 1;
        int[] arr = new int[ARRMAX];

        int randIdx, cnt = 1;

        for (; cnt <= 10; cnt++) {
            // 임의의 배열 인덱스를 선택하도록 지원
            randIdx = (int) (Math.random() * ARRMAX);
            // 실제 임의의 배열 인덱스에 접근하여 랜덤 값을 배치함
            arr[randIdx] = (int) (Math.random() * range + MIN);
            System.out.printf("randIdx: %d, arr[randIdx] = %d\n", randIdx, arr[randIdx]);
        }
    }
}
