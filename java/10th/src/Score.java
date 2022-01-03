import java.util.Scanner;

public class Score {
    // 학생 클래스에 수학, 영어, 국어 점수를 입력 받도록 개조합니다.
    // 6번 문제를 푸는데 있어 국영수만 처리하면 되지만
    // 실제로 점수라는 클래스는 보다 범용적으로 확장이 가능한 녀석이므로
    // 확장성을 고려한 설계를 진행하도록 한다.

    final int MAX = 10;

    String[] scoreName;
    Scanner scan;

    public void initScore () {
        scan = new Scanner(System.in);

        addSubject();
    }

    public boolean checkInput () {
        System.out.print("계속 입력하시겠습니까 ? (y/n): ");

        while (true) {
            String yOrN = scan.nextLine();

            if (yOrN.equals("n")) {
                return false;
            } else if (yOrN.equals("y")) {
                System.out.print("다음 과목을 입력하세요: ");
                return true;
            } else {
                System.out.print("다시 입력하세요! (y/n): ");
            }
        }
    }

    public void addSubject () {
        // 실제로는 Java의 Collection에 있는 Map이나 Vector를 사용해야 하는데
        // 여기서 직접 자료구조를 구현하는것도 에바고
        // 그렇다고 문제를 안 풀수도 없으니 일종의 꼼수로서
        // 백업 배열을 하나 만들어서 Java의 Collection 역할을 하게 만든다.
        String[] backup = new String[MAX];
        int cnt = 0;

        System.out.print("다루고 싶은 과목을 입력하세요: ");

        // 보편적으로 지저분한 코드는 어느 시점에 루프를 멈출지를 결정하는 부분에서 만들어진다.
        // 그러므로 루프를 언제 멈출지 판정하는 부분을 매서드화하면
        // 상대적으로 깔끔한 코드를 얻을 수 있다.
        do {
            backup[cnt++] = scan.nextLine();

            // 현재 다시 입력하세요를 구현하는 부분에서 boolean 변수가 추가됨에 따라
            // 코드의 가독성을 저해하는 부분이 있어
            // 기본적인 로직 작성후 매서드화 시키는 부분이 좋다 판단하여 삭제 처리
        } while (checkInput());

        for (int i = 0; i < cnt; i++) {
            System.out.printf("backup[%d] = %s\n", i, backup[i]);
        }
    }
}
