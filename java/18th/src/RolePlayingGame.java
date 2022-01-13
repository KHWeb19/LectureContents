import java.util.ArrayList;
import java.util.Scanner;

public class RolePlayingGame extends MacroSet {
    // 정석은 CharacterManager를 하나 만들어서
    // 이 가상 세계에 있는 캐릭터들의 턴 관리를 해줘야 한다.
    // 현재 예제에서는 위자드 클래스 하나만 활용하므로
    // 별도의 CharacterManager를 생성하지 않도록 한다.
    Wizard wiz;
    Knight kni;
    Sniper sni;
    HolyKing hk;
    Assassin sin;
    // 향후 CharacterManager로 업데이트!

    ArrayList<Object> raidMember;
    ArrayList<Integer> memberCheckList;

    Fenryl fenryl;

    final int KNIGHT = 1;
    final int WIZARD = 2;
    final int SNIPER = 3;
    final int HOLYKING = 4;
    final int ASSASSIN = 5;

    final int MAX = 10000;
    final int MIN = 100;

    Scanner scan;

    int range;

    public RolePlayingGame () {
        fenryl = new Fenryl();

        wiz = new Wizard();
        kni = new Knight();
        sni = new Sniper();
        hk = new HolyKing();
        sin = new Assassin();

        scan = new Scanner(System.in);

        raidMember = new ArrayList<>();
        memberCheckList = new ArrayList<>();

        range = MAX - MIN + 1;
    }

    public void chooseMember () {
        System.out.println("1번: 기사, 2번: 위자드, 3번: 스나이퍼, 4번: 성황, 5번: 어쌔신");

        for (int i = 0; i < 3; i++) {
            System.out.print("번호를 입력하세요: ");
            int num = scan.nextInt();

            switch (num) {
                case KNIGHT:
                    raidMember.add(kni);
                    memberCheckList.add(KNIGHT);
                    break;
                case WIZARD:
                    raidMember.add(wiz);
                    memberCheckList.add(WIZARD);
                    break;
                case SNIPER:
                    raidMember.add(sni);
                    memberCheckList.add(SNIPER);
                    break;
                case HOLYKING:
                    raidMember.add(hk);
                    memberCheckList.add(HOLYKING);
                    break;
                case ASSASSIN:
                    raidMember.add(sin);
                    memberCheckList.add(ASSASSIN);
                    break;
                default:
                    continue;
            }
        }
    }
    
    public void bossRaid () throws InterruptedException {
        // 레이드 출전 팀을 선별합니다!
        System.out.println("보스전(펜릴) 멤버를 선별하세요!");
        chooseMember();

        int turnCnt = 1;

        // 보스가 죽었는지 판정
        while (!fenryl.isDead()) {
            System.out.printf("%d 턴입니다\n", turnCnt++);
            fenryl.raidTurnStart(raidMember, memberCheckList);
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
