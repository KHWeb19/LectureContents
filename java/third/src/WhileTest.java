public class WhileTest {
    public static void main(String[] args) {
        boolean isEven = false;
        boolean isOdd = true;
        int num = 1;

        // while을 작성하는 방법
        // 1. while () { } 을 적는다.
        // 2. 소괄호 내부에 조건을 적는다.
        // 3. 중괄호 내부에 조건이 만족되었을 경우 작업할 내용을 작성한다.

        //while (!isEven) {
        while (isOdd) {
            // num += x
            // num = num + x와 동의어
            // 현재 아래 케이스에서는 아래와 같은 사항
            // num = num + (int) (Math.random() * 2 + 1);

            // 참고할 부분
            // +=, -=, *=, /=, %=
            // x += y ===> x = x + y
            // x -= y ===> x = x - y
            // x *= y ===> x = x * y
            // x /= y ===> x = x / y
            // x %= y ===> x = x % y
            num += (int) (Math.random() * 2 + 1);

            if (num % 2 == 0) {
                //isEven = true;
                isOdd = false;
            }

            System.out.println("num = " + num);
        }
    }
}
