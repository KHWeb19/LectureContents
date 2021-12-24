public class Answer2 {
    public static void main(String[] args) {
        int first = 1;
        int second = 1;
        int result = 0, i;

        final int START = 2;
        final int END = 20;

        // 컴퓨터에서 배열의 시작이 0이기 때문에
        // 반복 시작을 0을 기준으로 맞춰주는 것이 좋습니다.
        // 그래서 START 2는 결국 3번째
        for (i = START; i < END; i++) {
            result = first + second;
            first = second;
            second = result;

            // 전체 뿌리기
            // System.out.printf("%d번째 항 %d\n", i, result);
        }

        System.out.printf("%d번째 항 %d\n", i, result);
    }
}

//   1      1      2      3    5  8  13  21  34  55  89
// first second                                   첫 번째 루프
//        first second                            두 번째 루프
//               first second                     세 번째 루프