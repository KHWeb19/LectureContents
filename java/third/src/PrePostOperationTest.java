public class PrePostOperationTest {
    public static void main(String[] args) {
        // 일명 전위 연산자 vs 후위 연산자

        int i = 0;

        // 전위 연산자의 경우
        // 해당 줄이 실행되기 이전에 덧셈이 완료됨
        System.out.println("전위 연산");
        System.out.println("i = " + (++i));
        System.out.println("i = " + i);

        i = 0;

        System.out.println("초기화 확인 i = " + i);

        // 후위 연산자의 경우
        // 해당 줄이 실행된 이후에 덧셈이 완료됨
        System.out.println("후위 연산");
        System.out.println("i = " + (i++));
        System.out.println("i = " + i);
    }
}
