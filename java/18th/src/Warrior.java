public class Warrior extends Adventurer {
    final float WARRIOR_BONUS = 100;

    public Warrior () {
        super();

        warriorPromotionBonus();
    }

    public void warriorPromotionBonus () {
        pAtk += WARRIOR_BONUS;

        str += MAJOR;
        con += MAJOR;
        dex += MINOR;
        agi += MINOR;
        iq += MINOR;
        men += MINOR;
    }

    /*
    public int calcSevenSlashDamage (Fenryl target) {
        return (int) (7 * (pAtk * str * 0.7 + dex * 0.1));
    }

    @Override
    public void qSkill(Object obj) {
        // <<<--- 자동 완성 기능을 사용하면 super()를 부르고 있음
        //        보통 게임을 하게 되면 전직 했어도 이전 클래스의 기술을 사용할 수 있음
        //        super를 통해 이전 클래스의 스킬을 계승할 수 있음
        //        super를 안쓰고 새로운 스킬로 덮어쓰는 것임
        // super.qSkill();
        System.out.printf("%10d - 7연참(근거리)\n",
                calcSevenSlashDamage((Fenryl) obj));
    }

    public int calcSwordSharpenDamage (Fenryl target) {
        return (int) (pAtk * str * 0.5 + mAtk * 0.3);
    }

    @Override
    public void wSkill(Object obj) {
        System.out.printf("%10d - 칼등치기(근거리): 스턴 2초\n",
                calcSwordSharpenDamage((Fenryl) obj));
    }
     */
}
