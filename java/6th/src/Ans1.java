import java.util.Scanner;

public class Ans1 {
    public static void main(String[] args) {
        /*  아래와 같은 등비 수열이 있다.
            1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
            사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
            (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임) */

        // 2^8 = 1byte = 256개
        // -128 ~ -1 / 0 ~ 127
        // 0을 포함하기 때문에 2^32승도 맨 끝이 홀수로 되어 있음
        // 그래서 2^n을 표현한다고 할 때 실질적으로 전체 비트 - 1까지만 표현이 가능함
        // 결국 2^31승을 표현하지 못하고 2^31 - 1이 최대값이 되는데
        // 그래서 이 문제에서는 2^30승을 표현하기 위해 31번째까지가 최대가 됨
        final int MAX = 31;
        final int START_IDX = 0;
        final int BASE = 2;

        System.out.print("찾고자하는 수열의 항을 입력해주세요: ");

        Scanner scan = new Scanner(System.in);
        int idx = scan.nextInt();

        int[] seq = new int[idx];

        if (idx > MAX) {
            System.out.println("낵아 표현이 으앙돼 ㅠ 프로그램을 종료합니다.");
        } else {
            for (int i = START_IDX; i < idx; i++) {
                // Math.pow()는 n승을 계산함
                // Math.pow(x, y) = x^y로 x의 y승을 계산함
                // 즉 Math.pow(2, i)는 2의 i승을 의미함
                // 2^0 = 1, 2^1 = 2, 2^2 = 4 ...
                seq[i] = (int) Math.pow(BASE, i);
                System.out.printf("seq[%d] = %d\n", i, seq[i]);
            }
        }
    }
}
