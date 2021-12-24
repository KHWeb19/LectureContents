public class Answer8 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;
        int decision = (int) (Math.random() * range + MIN);

        for (int i = START; i <= END; i++) {
            if (i % decision == REMAIN) {
                System.out.printf("%d의 배수 i = %d\n", decision, i);
            }
        }
    }
}

/* 1 ~ 100까지 숫자를 순회한다.
   2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력 */

/*  소설 쓰면 됨 - 어차피 전략이란게 이래도 전략이고 저래도 전략임
    스타크래프트 하셨던 분들이라면 ... 4드론, 등등 전략 많잖아요.
    아무거나 일단 되는대로 지르고 되면 OK 안되면 수정 및 보완

    롤 - 대충 어디 숨어있다가 기어 나오면 땡겨와서 다 같이 뚜까 패자!

    1. 1 ~ 100까지 순회하도록 루프 생성 <<<--- for문 굴려야겠다.
    2. 2 ~ 10 사이의 랜덤값 생성 <<<--- Math.random() 써야겠다.
    3. 1 ~ 100 순회를 하면서 랜던값의 배수를 출력해야하므로 <<<--- 일단 if 쓰고 보자
       기존 짝수 검사, 3의 배수 검사처럼
       랜덤값에 대한 if 문 검사가 필요할 것 같다 ?
    4. 예상대로 잘 되었다면 출력하면 됨 <<<--- 출력

    * 바로 코드 x 먼저 문제를 풀어헤칩시다!
 */