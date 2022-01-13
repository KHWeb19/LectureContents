public class Wizard extends Magician {
    protected int boost;

    final float WIZARD_MAJOR_COEF = 1.35f;
    final float WIZARD_MINOR_COEF = 1.3f;

    public Wizard () {
        super();



        boost = 0;
    }

    public void wizardPromotionBonus () {
        mAtk += (MAGICIAN_BONUS * WIZARD_MAJOR_COEF);

        str += MINOR;
        con += (MINOR * WIZARD_MINOR_COEF);
        dex += MINOR;
        agi += (MINOR * WIZARD_MINOR_COEF);
        iq += (MAJOR * WIZARD_MAJOR_COEF);
        men += (MAJOR * WIZARD_MAJOR_COEF);
    }

    public int calcSuperGravityFieldDamage () {
        return (int) (100 * mAtk * iq * 1.1);
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 초중력(단일기 - boost 게이지 50 사용)\n",
                calcSuperGravityFieldDamage());
    }

    public int calcAltemaDamage () {
        return (int) (20 * mAtk * iq * 0.7);
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 알테마(범위기 - boost 게이지 20 사용)\n",
                calcAltemaDamage());
    }
}
