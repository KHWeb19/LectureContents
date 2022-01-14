public class Sniper extends Adventurer {

    final int SNIPER_BONUS = 500;

    // coefficient(계수)의 약자로 COEF 사용
    final float SNIPER_MAJOR_COEF = 3.5f;
    final float SNIPER_MINOR_COEF = 1.5f;

    public Sniper () {
        super();

        sniperPromotionBonus();
    }

    public void sniperPromotionBonus () {
        pAtk += (SNIPER_BONUS * SNIPER_MAJOR_COEF);

        str += (MINOR * SNIPER_MINOR_COEF);
        con += (MINOR * SNIPER_MINOR_COEF);
        dex += (MAJOR * SNIPER_MAJOR_COEF);
        agi += (MAJOR * SNIPER_MAJOR_COEF);
        iq += MINOR;
        men += MINOR;
    }

    // 향후 리팩토링이 필요하겠지만 우선 Object는 무조건 Fenryl로 취급하도록 하자!
    //public int calcBurstShotDamage (Object target) {
    public int calcBurstShotDamage (DamageCalcRequestObject dcro) {
        return (int) (5 * (pAtk - dcro.getpDef()) *
                ( (dex - dcro.getCon()) * 1.5 + (agi - dcro.getCon()) * 1.2) );
    }

    @Override
    public int qSkill(SelectedCharacter monsterSc) {
        dcro.procDamageCalcRequestObject(monsterSc);
        int damage = calcBurstShotDamage(dcro);

        System.out.printf("%10d - 버스트 샷(원거리)\n",
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
