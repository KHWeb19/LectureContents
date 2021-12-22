public class RandomTest {
    public static void main(String[] args) {
        // 랜덤을 만드는 방법!
        double rand1 = Math.random();
        float rand2 = (float)Math.random();

        // double은 소수점이 길게 나옴
        System.out.println("rand1 = " + rand1);
        // float은 표현할 수 있는 자리수가 적어서 소수점이 짧게 나옴
        System.out.println("rand2 = " + rand2);

        // 0.0 ~ 1.0 미만
        // 0.0 ~ 6.0 미만 (5.9999xxx)
        // 여기서 소수점을 버리면 결국 0 ~ 5
        // 그러므로 전체에 1을 더하면 1 ~ 6의 범위를 가지게 된다.
        int dice = (int)(Math.random() * 6 + 1);
        System.out.println("주사위 눈금 = " + dice);
    }
}
