public class Adventurer implements Skill {
    // 기본 스탯 (phy atk, mag atk, hp, mp, phy def, mag def,
    //          str(완력), con(vit:체력), dex(재주), agi(민첩), iq(지능), men(정신))
    //          경험치 바와 레벨 정보 추가
    // 누락: 체력 재생률, 마나 재생률
    protected float pAtk, mAtk;
    protected float hp, mp;
    protected float pDef, mDef;
    protected float str, con, dex, agi, iq, men;
    protected int level;
    protected int reqExp;
    protected int curExp;

    final float PATK = 50;
    final float MATK = 50;
    final float HP = 100;
    final float MP = 100;
    final float PDEF = 1;
    final float MDEF = 1;
    final int STR = 10;
    final int CON = 10;
    final int DEX = 10;
    final int AGI = 10;
    final int IQ = 10;
    final int MEN = 10;
    final int LEVEL = 1;
    final int REQEXP = 100;
    final int CUREXP = 0;

    final int MAJOR = 1000;
    final int MINOR = 500;

    protected DamageCalcRequestObject dcro;

    public Adventurer () {
        pAtk = PATK;
        mAtk = MATK;
        hp = HP;
        mp = MP;
        pDef = PDEF;
        mDef = MDEF;
        str = STR;
        con = CON;
        dex = DEX;
        agi = AGI;
        iq = IQ;
        men = MEN;
        level = LEVEL;
        reqExp = REQEXP;
        curExp = CUREXP;

        dcro = new DamageCalcRequestObject();
    }

    public int calcAttackDamage (DamageCalcRequestObject dcro) {
        return (int) (pAtk * (str + 0.3 * dex));
    }

    @Override
    public int attack(SelectedCharacter monsterSc) {
        dcro.procDamageCalcRequestObject(monsterSc);

        System.out.printf("%10d - 평타\n",
                calcAttackDamage(dcro));

        return 0;
    }

    public int calcQuackDamage (DamageCalcRequestObject dcro) {
        return (int) (pAtk * (0.6 * str + 0.3 * dex));
    }

    public int qSkill(SelectedCharacter monsterSc) {
        dcro.procDamageCalcRequestObject(monsterSc);

        System.out.printf("%10d - 돌팔매(원거리)\n",
                calcQuackDamage(dcro));

        return 0;
    }

    public int calcEnergyStrikeDamage (DamageCalcRequestObject dcro) {
        return (int) (mAtk * (1.2 * iq) + pAtk * (0.5 * str));
    }

    @Override
    public int wSkill(SelectedCharacter monsterSc) {
        dcro.procDamageCalcRequestObject(monsterSc);

        System.out.printf("%10d - 에너지 스트라이크(근거리)\n",
                calcEnergyStrikeDamage(dcro));

        return 0;
    }

    public void calcCharcterExp (int gettingExps, Integer charNum) {
        curExp += gettingExps;

        while (curExp - reqExp > 0) {
            level++;

            incStat(charNum);

            curExp -= reqExp;
            reqExp *= 1.1;
        }
    }
    /* 어차피 자신이 누군지 아는데 charNum이 필요한가 ?
    public void calcCharcterExp (int gettingExps, int charNum) {
        // 1. 입력된 경험치를 현재 경험치에 적용한다.
        // 2. 레벨업마다 요구 경험치를 증가시킨다.

        // 경험치 계산 이후 다음 경험치는 ???
        // curExp에 저장되는 부분을 고려하지 않았음
        // * 입력된 경험치는 curExp로 들어가야함
        // * curExp - reqExp를 빼면서 레벨업을 진행하면됨
        // * curExp - reqExp가 양수가 나온다면 레벨업 하고 curExp -= reqExp를 수행
        // * curExp - reqExp가 음수가 나온다면 레벨업 하지 않고 curExp에 현재 값을 유지시킴
        // * 레벨업시 reqExp를 증가시키는 부분도 누락하면 안됨 (요구 경험치는 10%씩 증가시킴)
        // * 스탯 증가
        curExp += gettingExps;

        while (curExp - reqExp > 0) {
            level++;

            incStat(charNum);

            curExp -= reqExp;
            reqExp *= 1.1;
        }
    }
     */

    public void incMagStat () {
        hp += 100;
        mp += 10;

        str += 1;
        con += 1;
        dex += 1;
        agi += 1;
        iq += 5;
        men += 4;
    }

    public void incKniStat () {
        hp += 100;
        mp += 10;

        str += 5;
        con += 4;
        dex += 1;
        agi += 1;
        iq += 1;
        men += 1;
    }

    // 병과류: 도적계열, 전사계열, 궁수계열
    //        이게 존재하면 좋은점
    //        계열에 따라 증가수치를 통일시킬 수 있음
    public void incSniStat () {
        hp += 100;
        mp += 10;

        str += 5;
        con += 4;
        dex += 1;
        agi += 1;
        iq += 1;
        men += 1;
    }

    public void incHkStat () {
        hp += 100;
        mp += 10;

        str += 1;
        con += 3;
        dex += 1;
        agi += 1;
        iq += 3;
        men += 4;
    }

    public void incSinStat () {
        hp += 100;
        mp += 10;

        str += 1;
        con += 3;
        dex += 3;
        agi += 4;
        iq += 1;
        men += 1;
    }

    public void incStat (int charNum) {
        switch (charNum) {
            case CharacterNumber.KNIGHT:
                incKniStat();
                break;

            case CharacterNumber.WIZARD:
                incMagStat();
                break;

            case CharacterNumber.SNIPER:
                incSniStat();
                break;

            case CharacterNumber.HOLYKING:
                incHkStat();
                break;

            case CharacterNumber.ASSASSIN:
                incSinStat();
                break;
        }
    }

    public void printInfo () {
        System.out.printf("pAtk: %d, mAtk: %d, hp: %d, mp: %d, " + "\n" +
                        "str: %d, con: %d, dex: %d, agi: %d, iq: %d, men: %d, " + "\n" +
                        "level: %d, exp: %d / %d\n",
                (int)pAtk, (int)mAtk, (int)hp, (int)mp,
                (int)str, (int)con, (int)dex,
                (int)agi, (int)iq, (int)men,
                level, curExp, reqExp);
    }

    @Override
    public String toString() {
        return "Character Stat{" + '\n' +
                "pAtk=" + pAtk +
                ", mAtk=" + mAtk + '\n' +
                ", hp=" + hp +
                ", mp=" + mp +
                ", pDef=" + pDef +
                ", mDef=" + mDef + '\n' +
                ", str=" + str +
                ", con=" + con +
                ", dex=" + dex +
                ", agi=" + agi +
                ", iq=" + iq +
                ", men=" + men + '\n' +
                ", level=" + level +
                ", Exp= " + reqExp +
                "/" + curExp + '\n' +
                '}';
    }
}
