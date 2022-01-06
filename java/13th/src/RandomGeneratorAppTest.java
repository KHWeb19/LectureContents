public class RandomGeneratorAppTest {
    public static void main(String[] args) {
        // 65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.
        // 여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자

        RandomGenerator rg = new RandomGenerator(
                65, 122,
                65, 90, 97, 122
        );

        int num = rg.conditionRandom();
        System.out.printf("조건부 난수 생성: %c(%d)\n", num, num);
    }
}
