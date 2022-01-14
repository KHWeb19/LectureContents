import java.util.ArrayList;
import java.util.Scanner;

public class RolePlayingGame extends MacroSet {

    ChracterManager cm;
    BossManager bm;

    final int MAX = 10000;
    final int MIN = 100;

    int range;

    public RolePlayingGame () {
        bm = new BossManager();
        cm = new ChracterManager();

        range = MAX - MIN + 1;
    }

    public void chooseMember () {
        System.out.println("보스전 멤버를 선별하세요!");
        cm.chooseMember();
    }

    public void chooseRaidBoss () {
        System.out.println("레이드 보스를 선택하세요!");
        bm.chooseRaidBoss();
    }
    
    public void bossRaid () throws InterruptedException {
        // 레이드를 치룰 보스를 선택합니다!
        chooseRaidBoss();

        // 레이드 출전 팀을 선별합니다!
        chooseMember();

        int turnCnt = 1;

        // 보스가 죽었는지 판정
        while (!bm.isDead()) {
            System.out.printf("%d 턴입니다\n", turnCnt++);
            bm.raidTurnStart(cm);
            Thread.sleep(2000);
        }

        System.out.println("승리!!!");
    }

    /*
    public void gameStart () throws InterruptedException {
        // 와일 루프가 매턴으로 계산됨
        // 매크로 돌린다 가정하고 특정 패턴을 반복한다 가정
        while (true) {
            wiz.printInfo();
            doMacroSet(THIRD, wiz);
            wiz.calcCharcterExp(calcExps(), THIRD);
        }
    }
     */

    public int calcExps () {
        return (int) (Math.random() * range + MIN);
    }
}
