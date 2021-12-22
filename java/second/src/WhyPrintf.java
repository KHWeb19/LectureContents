public class WhyPrintf {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7, num3 = 33, num4 = 77;

        System.out.println("num1 = " + num1 + ", num2 = " +
                num2 + ", num3 = " + num3 + ", num4 = " + num4);

        System.out.printf(
                "num1 = %d, num2 = %d, num3 = %d, num4 = %d\n",
                num1, num2, num3, num4
        );

        System.out.println("두 결과는 동일하다\n뭘 쓰겠습니까 ?");

        System.out.printf(
                "num1 = %d, num2 = %d, num3 = %d, num4 = %d\n",
                num1, num4, num2, num3
        );
    }
}
