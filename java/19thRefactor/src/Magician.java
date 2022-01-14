public class Magician extends Adventurer {
    final float MAGICIAN_BONUS = 80;

    public Magician () {
        super();

        magicianPromotionBonus();
    }

    public void magicianPromotionBonus () {
        mAtk += MAGICIAN_BONUS;

        str += MINOR;
        con += MINOR;
        dex += MINOR;
        agi += MINOR;
        iq += MAJOR;
        men += MAJOR;
    }

    /*
    public int calcChainLightningDamage () {
        return (int) (mAtk * iq * 2.5);
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 체인 라이트닝(원거리)\n",
                calcChainLightningDamage());
    }

    public int calcFrostNovaDamage () {
        return (int) (mAtk * iq * 0.25);
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 프로스트 노바(광범위): 범위 슬로우\n",
                calcFrostNovaDamage());
    }
     */
}
