public class Knight extends Warrior {
    private int anger;

    public Knight () {
        super();

        strUpdate(MAJOR);
        conUpdate(MAJOR);
        dexUpdate(MINOR);
        agiUpdate(MINOR);
        iqUpdate(MINOR);
        menUpdate(MINOR);

        anger = 0;
    }

    public void absoluteBlessing () {
        System.out.println("5초간 모든 데미지에 면역(상태 이상 면역)");
    }

    @Override
    public void qSkill() {
        System.out.printf("절대자의 가호(버프)\n");
        absoluteBlessing();
    }

    public int calcCutOffSlashDamage () {
        return (int) (20 * getmAtk() * (getStr() * 0.6 + getDex() * 0.2));
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 일도양단(범위기 - 분노 게이지 20 사용)\n", calcCutOffSlashDamage());
    }
}
