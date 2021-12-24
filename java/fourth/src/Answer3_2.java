public class Answer3_2 {
    public static void main(String[] args) {
        int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 2;
        int result = 0, i;

        final int START = 4;
        final int END = 20;

        // 컴퓨터에서 배열의 시작이 0이기 때문에
        // 반복 시작을 0을 기준으로 맞춰주는 것이 좋습니다.
        // 그래서 START 2는 결국 3번째
        for (i = START; i < END; i++) {
            result = first + second + third;
            first = second;
            second = third;
            third = fourth;
            fourth = result;

            // 전체 뿌리기
            System.out.printf("%d번째 항 %d\n", i + 1, result);
        }

        System.out.printf("%d번째 항 %d\n", i, result);
    }
}

//   1      1      1      2      3      4     6     9    13
// first second  third fourth                                  첫 번째 루프
//        first second  third fourth                           두 번째 루프
//               first second  third fourth                    세 번째 루프