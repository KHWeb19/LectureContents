public class Answer9 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;
        /*  1 ~ 100까지의 숫자를 순회한다.
            2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
            다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다. */

        // 구현 전략이 필요함
        // 1. 1 ~ 100까지 숫자 순회는 for문을 사용
        // 2. for 문 내부에서 랜덤 난수 생성 2 ~ 10
        // 3. 난수의 배수를 검사하기 전까지 랜덤을 다시 생성하면 안됨

        // 실제 난수의 할당(생성) 했는지 안했는지 판정 여부
        boolean isRandomAllocCheck = false;
        int decision = 0;
        int sum = 0;

        for (int i = START; i <= END; i++) {
            while (!isRandomAllocCheck) {
                decision = (int) (Math.random() * range + MIN);
                isRandomAllocCheck = true;
            }

            if (i % decision == REMAIN) {
                System.out.printf("%d의 배수 i = %d\n", decision, i);
                isRandomAllocCheck = false;

                sum += i;
            }
        }

        System.out.println("현재까지 나타난 숫자들의 합 = " + sum);
    }
}
