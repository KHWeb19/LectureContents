public class Assassin extends Adventurer {

    final int ASSASSIN_BONUS = 400;

    // coefficient(계수)의 약자로 COEF 사용
    final float ASSASSIN_MAJOR_COEF = 2.8f;
    final float ASSASSIN_MINOR_COEF = 1.8f;

    public Assassin() {
        super();

        assassinPromotionBonus();
    }

    public void assassinPromotionBonus () {
        pAtk += (ASSASSIN_BONUS * ASSASSIN_MAJOR_COEF);

        str += (MINOR * ASSASSIN_MINOR_COEF);
        con += (MINOR * ASSASSIN_MINOR_COEF);
        dex += (MAJOR * ASSASSIN_MAJOR_COEF);
        agi += (MAJOR * ASSASSIN_MAJOR_COEF);
        iq += MINOR;
        men += (MINOR * ASSASSIN_MINOR_COEF);
    }

    // 향후 리팩토링이 필요하겠지만 우선 Object는 무조건 Fenryl로 취급하도록 하자!
    //public int calcBurstShotDamage (Object target) {
    public int calcDisasterStepDamage (Fenryl target) {
        float sum = 0;

        final int MAX = 1;
        final int MIN = 0;

        int range = MAX - MIN + 1;
        float criticalCoef;
        int criticalFlag;

        for (int i = 0; i < 10; i++) {
            criticalFlag = (int) (Math.random() * range + MIN);
            if (criticalFlag % 2 == 0) {
                criticalCoef = 1.5f;
            } else {
                criticalCoef = 1.0f;
            }

            sum += ( criticalCoef * (12 * (pAtk - target.pDef) *
                    ( (dex - target.con) * 2.3 + (agi - target.con) * 1.5) ) );
        }

        return (int) sum;
    }

    @Override
    public int qSkill(Object obj) {
        int damage = calcDisasterStepDamage((Fenryl) obj);
        System.out.printf("%10d - 디제스터 스텝(10연격)\n",
                damage);

        return damage;
    }

    /*
    public int calcCutOffSlashDamage () {
        return (int) (20 * mAtk * (str * 0.6 + dex * 0.2));
    }

    @Override
    public void wSkill(Object obj) {
        System.out.printf("%10d - 일도양단(범위기 - 분노 게이지 20 사용)\n",
                calcCutOffSlashDamage((Fenryl) obj));
    }
     */
}
