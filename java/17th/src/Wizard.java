public class Wizard extends Magician {
    private int boost;

    public Wizard () {
        super();

        strUpdate(MINOR);
        conUpdate(MINOR);
        dexUpdate(MINOR);
        agiUpdate(MINOR);
        iqUpdate(MAJOR);
        menUpdate(MAJOR);

        boost = 0;
    }

    public int calcSuperGravityFieldDamage () {
        return (int) (100 * getmAtk() * getIq() * 1.1);
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 초중력(단일기 - boost 게이지 50 사용)\n",
                calcSuperGravityFieldDamage());
    }

    public int calcAltemaDamage () {
        return (int) (20 * getmAtk() * getIq() * 0.7);
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 알테마(범위기 - boost 게이지 20 사용)\n",
                calcAltemaDamage());
    }

    public void printInfo () {
        System.out.printf("hp: %d, mp: %d, " + "\n" +
                "str: %d, con: %d, dex: %d, agi: %d, iq: %d, men: %d, " + "\n" +
                "level: %d, exp: %d / %d\n",
                (int)getHp(), (int)getMp(),
                (int)getStr(), (int)getCon(), (int)getDex(),
                (int)getAgi(), (int)getIq(), (int)getMen(),
                getLevel(), getCurExp(), getReqExp());
    }
}
