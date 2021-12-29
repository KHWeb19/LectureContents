public class QnA6 {
    public static void main(String[] args) {
        /* Q.   음수로표현이되는데 그값을 양수로 받아서
                사용하고싶을땐 어떻게 표현해야하는지 궁금합니다. */

        final int MAX = 10;
        final int MIN = 1;

        int range = MAX - MIN + 1;

        final int BIAS = 5;
        int rand;

        while (true) {
            // 4 ~ -5
            rand = BIAS - (int) (Math.random() * range + MIN);

            //System.out.println("4 ~ -5 사이의 숫자를 마구 뿌려보자: " + rand);
            System.out.printf("나는 양수만 뿌릴래: %d\n", ((int) Math.abs(rand)));
        }
    }
}
