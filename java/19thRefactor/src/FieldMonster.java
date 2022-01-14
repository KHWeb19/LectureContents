public class FieldMonster extends Adventurer {
    /*
    protected float pAtk, mAtk;
    protected float hp, mp;
    protected float pDef, mDef;
    protected float str, con, dex, agi, iq, men;
    protected int level;
    protected int reqExp;
    protected int curExp;
     */

    final float PATK = 50;
    final float MATK = 50;
    final float HP = 100;
    final float MP = 100;
    final float PDEF = 50;
    final float MDEF = 50;
    final int STR = 10;
    final int CON = 9;
    final int DEX = 10;
    final int AGI = 10;
    final int IQ = 10;
    final int MEN = 9;

    public FieldMonster() {
        pAtk = PATK;
        mAtk = MATK;
        iq = IQ;
        mp = MP;
        str = STR;
        dex = DEX;

        hp = HP;
        pDef = PDEF;
        mDef = MDEF;
        con = CON;
        agi = AGI;
        men = MEN;
    }
}
