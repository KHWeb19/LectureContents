public class Magician extends Adventurer {

    public Magician () {
        super();

        strUpdate(MINOR);
        conUpdate(MINOR);
        dexUpdate(MINOR);
        agiUpdate(MINOR);
        iqUpdate(MAJOR);
        menUpdate(MAJOR);
    }

    public int calcChainLightningDamage () {
        return (int) (getmAtk() * getIq() * 2.5);
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 체인 라이트닝(원거리)\n", calcChainLightningDamage());
    }

    public int calcFrostNovaDamage () {
        return (int) (getmAtk() * getIq() * 0.25);
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 프로스트 노바(광범위): 범위 슬로우\n", calcFrostNovaDamage());
    }
}
