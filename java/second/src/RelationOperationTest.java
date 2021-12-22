public class RelationOperationTest {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7;
        // boolean 데이터 타입은 참, 거짓을 판정하는 데이터타입
        boolean res;

        // 같은가 ?
        res = num1 == num2;
        System.out.println("res: " + res);

        // 다른가 ?
        res = num1 != num2;
        System.out.println("res: " + res);

        // num1 기준으로 작은가 ?
        res = num1 < num2;
        System.out.println("res: " + res);

        // 동일 기준으로 작거나 같은가 ?
        res = num1 <= num2;
        System.out.println("res: " + res);

        // 이하동문 큰가 ?
        res = num1 > num2;
        System.out.println("res: " + res);

        // 이하동문 크거나 같은가 ?
        res = num1 >= num2;
        System.out.println("res: " + res);
    }
}
