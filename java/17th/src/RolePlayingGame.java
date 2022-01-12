public class RolePlayingGame extends MacroSet {
    // 정석은 CharacterManager를 하나 만들어서
    // 이 가상 세계에 있는 캐릭터들의 턴 관리를 해줘야 한다.
    // 현재 예제에서는 위자드 클래스 하나만 활용하므로
    // 별도의 CharacterManager를 생성하지 않도록 한다.
    Wizard wiz;

    final int THIRD = 3;
    final int MAX = 10000;
    final int MIN = 100;

    int range;

    public RolePlayingGame () {
        wiz = new Wizard();

        range = MAX - MIN + 1;
    }

    public void gameStart () throws InterruptedException {
        // 와일 루프가 매턴으로 계산됨
        // 매크로 돌린다 가정하고 특정 패턴을 반복한다 가정
        while (true) {
            doMacroSet(THIRD, wiz);
            wiz.calcCharcterExp(calcExps(), THIRD);
            wiz.printInfo();
        }
    }

    public int calcExps () {
        return (int) (Math.random() * range + MIN);
    }
}
