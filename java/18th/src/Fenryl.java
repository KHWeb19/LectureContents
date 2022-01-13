import java.util.ArrayList;

public class Fenryl {
    protected float pAtk, mAtk;
    protected float hp, mp;
    protected float pDef, mDef;
    protected float str, con, dex, agi, iq, men;
    protected int level;
    protected int reqExp;
    protected int curExp;

    final float PATK = 50;
    final float MATK = 50;
    final float HP = 1000000000;
    final float MP = 100;
    final float PDEF = 1150;
    final float MDEF = 1150;
    final int STR = 10;
    final int CON = 900;
    final int DEX = 10;
    final int AGI = 1000;
    final int IQ = 10;
    final int MEN = 900;

    // RolePlayingGame과 Fenryl 모두 이게 들어가 있음
    // 공통된 객체를 하나 만들어서 관리하거나 유틸리티가 있으면 좋을 것임
    // 내일 리팩토링시 적용토록 함!
    final int KNIGHT = 1;
    final int WIZARD = 2;
    final int SNIPER = 3;
    final int HOLYKING = 4;
    final int ASSASSIN = 5;

    public Fenryl () {
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

    public boolean isDead () {
        if (hp <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void raidTurnStart (ArrayList<Object> member, ArrayList<Integer> check) {
        for (int i = 0; i < 3; i++) {
            switch (check.get(i)) {
                case KNIGHT:
                    hp -= ((Knight)member.get(i)).qSkill(this);
                    break;
                case WIZARD:
                    hp -= ((Wizard)member.get(i)).qSkill(this);
                    break;
                case SNIPER:
                    hp -= ((Sniper)member.get(i)).qSkill(this);
                    break;
                case HOLYKING:
                    hp -= ((HolyKing)member.get(i)).qSkill(this);
                    break;
                case ASSASSIN:
                    hp -= ((Assassin)member.get(i)).qSkill(this);
                    break;
            }
        }
    }
}
