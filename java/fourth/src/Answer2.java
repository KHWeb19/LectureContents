public class Answer2 {
    public static void main(String[] args) {
        int first = 1;
        int second = 1;
        int result = 0, i;

        final int START = 2;

        // 컴퓨터에서 배열의 시작이 0이기 때문에
        // 반복 시작을 0을 기준으로 맞춰주는 것이 좋습니다.
        // 그래서 START 2는 결국 3번째
        for (i = START; i < 20; i++) {
            result = first + second;
            first = second;
            second = result;

            // 전체 뿌리기
            // System.out.printf("%d번째 항 %d\n", i, result);
        }

        System.out.printf("%d번째 항 %d\n", i, result);
    }
}
