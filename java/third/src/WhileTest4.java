public class WhileTest4 {
    public static void main(String[] args) {
        int i = 0;

        // 1 ~ 30까지의 숫자중 5의 배수를 모두 출력하세요
        // 와 같은 역할을 수행하게 됨
        while (i < 31) {
            i++;

            if (i % 5 == 0) {
                System.out.printf("i는 5의 배수 = %d\n", i);
            }
        }
    }
}
