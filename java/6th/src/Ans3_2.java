public class Ans3_2 {
    // 3번 꼼수 버전
    // 배열을 이용해서 처리할 경우
    // 추가적인 작업이 존재할 때
    // 예) 번호 범위 어디는 배당률 얼마 같은 설정이 가능해짐
    // 현재 케이스는 배열이 아니기 때문에 이와 같은 복합 설정은 어려움
    // 어쨋든 문제 풀이는 맞다고 볼 수 있음
    public static void main(String[] args) {
        final int MAX_NUM = 5;

        int[] selectedLotto = new int[MAX_NUM];

        final int MAX = 100;
        final int MIN = 1;

        int range = MAX - MIN + 1;

        for (int i = 0; i < MAX_NUM; i++) {
            selectedLotto[i] = (int) (Math.random() * range + MIN);
            System.out.printf("당첨 번호: %d\n", selectedLotto[i]);
        }
    }
}
