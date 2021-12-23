public class WhileTest2 {
    public static void main(String[] args) {
        int i = 0;

        // i가 10보다 작다면 참
        // 참인 동안은 while loop 반복
        // i가 10이 되면 조건이 거짓이 되므로 끝
        
        // ++은 더하기 1이라고 보면 됨
        while (i++ < 10) {
            System.out.println("i = " + i);
        }
    }
}
