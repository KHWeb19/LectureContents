public class ForTest {
    public static void main(String[] args) {
        // for문을 작성하는 방법
        // 1. for () { }를 적는다.
        // 2. 소괄호 내부에는 작성하는 기준이 조금 많다.
        //    2-1. 초기화 루틴
        //    2-2. 조건
        //    2-3. 증감
        //    for (초기화; 조건; 증감) 형식으로 구성됨
        // 3. 소괄호 내의 조건이 만족된다면
        //    동작시킬 코드를 중괄호 내부에 작성한다.

        // [1] 초기화 부분은 for문 진입시 최초 한 번만 실행된다.
        // [2] 조건은 매 반복마다 검사한다.
        // [3] 증감은 중괄호 내부의 내용이 끝나면 진행한다.
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        
        // 동작 시나리오 일부 예
        // 1. for (int i = 1; i <= 10; i++)를 만났으므로 i는 1이 됨
        // 2. i <= 10 조건을 비교하고 결과는 참이므로 중괄호 진행
        // 3. i값인 1을 출력
        // 4. 중괄호 파트가 끝났으므로 증감이 진행되어 i는 2가 됨
        // 5. 조건은 매 반복마다 검사하라고 하였으므로 i <= 10을 비교(역시 참)
        // 6. 중괄호 진행하여 i값인 2 출력
        // 7. 4번 ~ 6번을 끝날때까지 반복

        // * 초기화, 증감, 조건 모두 없어도 된다.
    }
}
