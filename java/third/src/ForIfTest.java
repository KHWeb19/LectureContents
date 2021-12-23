public class ForIfTest {
    public static void main(String[] args) {
        // 1 ~ 100까지 숫자중 짝수만 출력하세요.
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println("짝수 = " + i);
            }
        }
    }
}
