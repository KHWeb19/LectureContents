public class QnA3 {
    public static void main(String[] args) {
        int rand1 = (int) Math.random() * 5;
        int rand2 = (int) Math.random() * 10;

        System.out.println("랜덤값1 = " + rand1);
        System.out.println("랜덤값2 = " + rand2);

        // Q. 결과값이 0만 나오는 이유는?
        // A. (int) Math.random() * 5의 경우
        //    [(int) Math.random()]을 먼저 처리하고 곱하기 5를 함
        //    그러므로 0 * 5를 하니 무조건 0이 나오는 것
        //    그래서 코드에 보면 (int) (Math.random() * 5) 형식으로 썻던것
    }
}
