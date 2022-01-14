public class MacroSet {
    // 전사 매크로
    final int SECOND = 2;
    // 법사 매크로
    final int THIRD = 3;

    public MacroSet () {
        System.out.println("매크로 구동 준비 완료!");
    }

    /*
    public void doMacroSet (final int num, Object obj) throws InterruptedException {
        // Object는 모든 데이터 타입을 받을 수 있는 가장 큰 집합임
        // 1. Object를 넘겨 받았으므로 전사 루틴을 처리할지 법사 루틴을 처리할지 결정하도록 만듬
        // 2. 루틴이 정해지면 각각에 맞게 매크로 루틴을 동작시킴
        switch (num) {
            case SECOND:
                System.out.println("지금부터 전사의 정해진 행동 패턴을 구동합니다!");
                Knight kni = (Knight) obj;
                // 각자 지정한 매크로에 따라 ~ 알아서 동작
                break;

            case THIRD:
                System.out.println("지금부터 법사의 정해진 행동 패턴을 구동합니다!");
                Wizard wiz = (Wizard) obj;
                for (int i = 0; i < 3; i++) {
                    wiz.wSkill();
                }
                wiz.qSkill();
                Thread.sleep(3000);     // ms = 10^-3 s
                break;

            default:
                System.out.println("없는 매크로 입니다!");
                break;
        }
    }
     */
}
