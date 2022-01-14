import java.util.ArrayList;

public class RolePlayingGame extends MacroSet {

    CharacterManager cm;
    MonsterManager bm;

    final int MAX = 10000;
    final int MIN = 100;

    int range;

    public RolePlayingGame () {
        // 몬스터 관리 객체
        bm = new MonsterManager();
        // 캐릭터 관리 객체
        cm = new CharacterManager();

        range = MAX - MIN + 1;
    }

    public void chooseMember () {
        System.out.println("파티 멤버를 선별하세요!");
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

    public void printPartyInfo () {
        cm.printPartyInfo();
    }

    public void calcCharacterExps(int exps, CharacterManager cm) {
        ArrayList<SelectedCharacter> member = cm.getMemberArrayList();

        SelectedCharacter sc;

        for (int i = 0; i < member.size(); i++) {
            sc = member.get(i);

            ((Adventurer) sc.getCharacter()).calcCharcterExp(exps, sc.getSelectedNum());
        }
    }

    public void huntStart () throws InterruptedException {
        // 앞서 만든 CharacterManager를 기반으로
        // 일반 사냥의 케이스도 관리하도록 만들어주면 된다.
        // 사냥 팀을 선별합니다!
        chooseMember();
        
        while (true) {
            printPartyInfo();
            // wiz.printInfo();
            doMacroSet(cm);
            //doMacroSet(THIRD, wiz);
            calcCharacterExps(calcExps(), cm);
            //wiz.calcCharcterExp(calcExps(), THIRD);
            Thread.sleep(1500);
        }
    }

    public int calcExps () {
        return (int) (Math.random() * range + MIN);
    }
}
