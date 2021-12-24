public class Answer10 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;
        /*  1 ~ 100까지의 숫자를 순회한다.
            9번과 유사하게 2 ~ 10을 가지고 작업을 진행한다.
            다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
            이동했을때 나온 숫자들의 합을 계산하도록 만들어보자! */

        int decision = 0;
        int sum = 0;

        //final int DEATH = 44;

        for (int i = START; i <= END; i += decision) {
            decision = (int) (Math.random() * range + MIN);

            System.out.printf("뽑은 난수 = %d, 현재 이동한 위치 = %d\n", decision, i);

            /*
            if (i == DEATH) {
                i = START;
            }
             */

            sum += i;
        }

        System.out.println("현재까지 나타난 숫자들의 합 = " + sum);
    }
}
