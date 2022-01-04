public class RandomGeneratorTest {
    public static void main(String[] args) {
        RandomGenerator rg = new RandomGenerator(4, 97);

        if (!rg.confirmRandom()) {
            System.out.println("난수 생성에 문제가 있음");
        } else {
            System.out.println("난수 생성: " + rg.intGenerate());
        }

        RandomGenerator rg2 = new RandomGenerator(
                65, 90, 97, 122
        );

        if (!rg2.confirmComplicatedRandom()) {
            System.out.println("난수 생성에 문제가 있음");
        } else {
            System.out.println("복합 난수 생성: " + rg2.complicatedRandom());
        }
    }
}
