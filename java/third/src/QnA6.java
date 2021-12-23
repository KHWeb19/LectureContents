public class QnA6 {
    public static void main(String[] args) {
        // 65 ~ 122 까지의 난수를 무작위로 생성하고
        // 65 ~ 90 혹은 97 ~ 122 에 해당하는 숫자만 출력

        final int MAX = 122;
        final int MIN = 65;

        int range = MAX - MIN + 1;
        int rand = (int) (Math.random() * range + MIN);

        // if (rand >= 65 && rand <= 90)
        // 위의 코드와 동의어
        if (rand >= 65) {
            if (rand <= 90) {
                System.out.printf("대문자 범주: %c(%d)\n", rand, rand);
            }
        }

        // if (rand >= 97 && rand <= 122)
        // 위의 코드와 동의어
        if (rand >= 97) {
            if (rand <= 122) {
                System.out.printf("소문자 범주: %c(%d)\n", rand, rand);
            }
        }
    }
}
