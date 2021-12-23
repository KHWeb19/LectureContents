public class WhileTest3 {
    public static void main(String[] args) {
        int i = 0;

        // while 조건식 내부에서 전위, 후위 연산자를 쓰는것이 혼동된다면
        // 아래와 같이 그냥 내부에서 ++ 해도 상관없음
        // 하다보면 조금이라도 덜 적고 싶어서 알아서 하게 됨
        while (i < 10) {
            i++;
            System.out.println("i = " + i);
        }
    }
}
