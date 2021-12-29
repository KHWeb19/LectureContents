import java.util.Scanner;

public class QnA7 {
    public static void main(String[] args) {
        final int MAX = 31;
        final int START_IDX = 0;
        final int BASE = 2;

        System.out.print("찾고자하는 수열의 항을 입력해주세요: ");

        Scanner scan = new Scanner(System.in);
        int idx = scan.nextInt();

        int[] seq = new int[idx];

        // 현재 케이스에서는 2^0이 계산되는 구조이므로 불필요함
        // 그러나 초항을 설정하고 이전항에 연산이 적용되는 경우에는
        // 아래와 같은 예외 처리가 적용될 필요가 있음
        if (idx == 1) {
            System.out.printf("seq[0] = %d\n", (int) Math.pow(BASE,0));
        } else if (idx > MAX) {
            System.out.println("잘못된 입력: 프로그램을 종료합니다.");
        } else {
            for (int i = START_IDX; i < idx; i++) {
                seq[i] = (int) Math.pow(BASE, i);
                System.out.printf("seq[%d] = %d\n", i, seq[i]);
            }
        }
    }
}
