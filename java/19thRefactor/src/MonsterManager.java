import java.util.Scanner;

public class MonsterManager {
    // 이 클래스는 도대체 어떤 업무를 담당하는가 ?
    // 게임상 존재하는 모든 보스 레이드를 관리해주는 클래스다!
    // 1. 우선적으로 레이드를 치룰 보스몹 자체를 관리하도록 한다.
    private SelectedCharacter sc;

    private final Scanner scan = new Scanner(System.in);
    final int BIAS = 9999;

    public void procUserInput (int num) {
        switch (num + BIAS) {
            case MonsterNumber.FENRYL:
                Fenryl fenryl = new Fenryl();
                sc = new SelectedCharacter(
                        MonsterNumber.FENRYL, fenryl);
                break;

            default:
                break;
        }
    }

    public void chooseRaidBoss () {
        int cnt = 0;

        System.out.println("1번: 펜릴, 2번: 미구현, 3번: 미구현, 4번: 미구현, 5번: 미구현");

        while (cnt < 1) {
            System.out.print("번호를 입력하세요: ");
            int num = scan.nextInt();

            if (num >= 6 || num <= 0) {
                continue;
            }

            cnt++;

            procUserInput(num);
        }
    }

    public boolean isDead () {
        boolean deadFlag = false;

        switch (sc.getSelectedNum()) {
            case MonsterNumber.FENRYL:
                deadFlag = ((Fenryl) sc.getCharacter()).isDead();
                break;
        }

        return deadFlag;
    }

    public void raidTurnStart (CharacterManager cm) {
        switch (sc.getSelectedNum()) {
            case MonsterNumber.FENRYL:
                ((Fenryl) sc.getCharacter()).raidTurnStart(cm);
                break;
        }
    }
}
