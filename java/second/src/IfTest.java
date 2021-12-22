public class IfTest {
    public static void main(String[] args) {
        // 0 ~ 9
        // 3 ~ 12
        int rand = (int)(Math.random() * 10 + 3);

        // if문을 작성하는 방법
        // 1. if () { } 를 적는다.
        // 2. 소괄호 내부에 조건을 적는다.
        // 3. 소괄호 조건이 만족될 경우 진행할 코드를 중괄호 내부에 적는다.
        // 4. 소괄호 조건이 만족되지 않을 경우 else가 진행된다.
        // 5. else가 없다면 그대로 끝난다.

        // 조건: rand % 2 == 0
        // rand라는 변수의 값을 2로 나눈 나머지가 0이 맞나요 ?
        // 나머지가 얼마인지 파악하는 연산자가 % 연산자입니다.
        // == 는 같다가 아님
        // 그럼 뭘까요 ? '같은가 ?' 라는 질문입니다.
        if (rand % 2 == 0) {
            System.out.println("나는 짝수: " + rand);
        } else {
            System.out.println("나는 홀수: " + rand);
        }
    }
}
