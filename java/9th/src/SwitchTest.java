import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        final int EQUIPMENT = 1;
        final int STATUS = 2;
        final int EXIT = 3;

        Scanner scan = new Scanner(System.in);

        boolean isNotFinish = true;

        while (isNotFinish) {
            System.out.println("1. 장비, 2. 특성, 3. 종료");
            System.out.print("원하는 기능을 입력하세요: ");

            int num = scan.nextInt();

            // if: 범주형 데이터 다루기에 유리
            // switch: 하나 하나 세부 옵션 다루기에 유리
            // 근대 둘 다 어느걸 해도 다 가능하게 만들 수 있음
            // 대표 예) 성적 관리 A: 90 ~ 100, B: 80 ~ 89, C: 70 ~ 79, D: 60 ~ 69, F: 60 미만

            // switch를 만드는 방법
            // 1. switch () {} 를 적는다.
            // 2. 소괄호에는 여러 케이스가 나타날 변수를 작성한다.
            // 3. 중괄호 내부에 case 현상: 을 적고 코드를 작성한다.
            // 4. 반드시 마무리시에는 break; 를 걸어서 하위 case 문을 침범하지 않도록 만든다.
            switch (num) {
                // if (num == EQUIPMENT)
                case EQUIPMENT:
                    System.out.println("장비를 눌럿습니다!");
                    break;
                // else if (num == STATUS)
                case STATUS:
                    System.out.println("캐릭터 특성창입니다!");
                    break;
                // else if (num == EXIT)
                case EXIT:
                    System.out.println("종료합니다!");
                    isNotFinish = false;
                    break;
            }
        }
    }
}
