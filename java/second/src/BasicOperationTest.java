public class BasicOperationTest {
    public static void main(String[] args) {
        int num1 = 7, num2 = 3;

        int res = num1 + num2;
        System.out.printf("%d + %d = %d\n", num1, num2, res);

        res = num1 - num2;
        System.out.printf("%d - %d = %d\n", num1, num2, res);

        // 곱셈: shift + 8
        res = num1 * num2;
        System.out.printf("%d * %d = %d\n", num1, num2, res);

        // 나눗셈: 슬래쉬
        res = num1 / num2;
        System.out.printf("%d / %d = %d\n", num1, num2, res);

        // 나머지를 구하는 녀석
        // num1을 num2로 나눴을때 나오는 나머지값을 구함
        res = num1 % num2;
        //System.out.printf("%d %c %d = %d\n", num1, 37, num2, res);
        // 위 처럼 %c를 이용한 아스키 꼼수가 쓰기 싫다면
        // 아래와 같이 %% 형식으로 %를 표기할 수도 있다.
        System.out.printf("%d %% %d = %d\n", num1, num2, res);
        System.out.printf("%d %s %d = %d\n", num1, "%", num2, res);

        // 실제 영문자의 경우 아스키코드로 구성되며
        // 이 아스키코드는 숫자와 1대1로 대응된다.
        // 37이라는 아스키코드는 문자 %에 대응되므로
        // %c라는 문자를 출력하는 format(형식)을 배치하고
        // 37을 배치하여 %를 출력하도록 만들었다.
    }
}
