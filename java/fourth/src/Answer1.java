public class Answer1 {
    public static void main(String[] args) {
        final int MAX = 122;
        final int MIN = 65;

        int range = MAX - MIN + 1;
        boolean isChar = true;

        while (isChar) {
            int rand = (int) (Math.random() * range + MIN);

            // 65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.
            // 여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자
            boolean condition1 = rand >= 65 && rand <= 90;
            boolean condition2 = rand >= 97 && rand <= 122;

            if (condition1 || condition2) {
                System.out.printf("rand는 영문자 대소문자중 하나임: %c(%d)\n", rand, rand);
                isChar = false;
                // break를 걸면 제어문 while, for 등을 바로 빠져나감
                break;
            }

            System.out.printf("문자가 아님: %c(%d)\n", rand, rand);
        }
    }
}
