public class Warrior extends Adventurer {

    public Warrior () {
        super();

        strUpdate(MAJOR);
        conUpdate(MAJOR);
        dexUpdate(MINOR);
        agiUpdate(MINOR);
        iqUpdate(MINOR);
        menUpdate(MINOR);
    }

    public int calcSevenSlashDamage () {
        return (int) (7 * (getpAtk() * getStr() * 0.7 + getDex() * 0.1));
    }

    @Override
    public void qSkill() {
        // <<<--- 자동 완성 기능을 사용하면 super()를 부르고 있음
        //        보통 게임을 하게 되면 전직 했어도 이전 클래스의 기술을 사용할 수 있음
        //        super를 통해 이전 클래스의 스킬을 계승할 수 있음
        //        super를 안쓰고 새로운 스킬로 덮어쓰는 것임
        // super.qSkill();
        System.out.printf("7연참:\t%10d\n", calcSevenSlashDamage());
    }

    public int calcSwordSharpenDamage () {
        return (int) (getpAtk() * getStr() * 0.5 + getmAtk() * 0.3);
    }

    @Override
    public void wSkill() {
        System.out.printf("칼등치기:\t%10d - 스턴 2초\n", calcSwordSharpenDamage());
    }
}
