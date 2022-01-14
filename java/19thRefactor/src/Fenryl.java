public class Fenryl extends Adventurer {
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

    public void raidTurnStart (CharacterManager cm) {
        // cm에 있는 member(ArrayList)를 활용해서
        // 아래 루틴을 돌 수 있게 하면
        // 앞으로 새로운 기능들을 추가할 때
        // 보다 편리하게 유지보수가 가능해질 것이다.
        SelectedCharacter sc;
        SelectedCharacter monsterSc = new SelectedCharacter(MonsterNumber.FENRYL, this);

        for (int i = 0; i < cm.memberSize(); i++) {
            sc = cm.getMemberArrayList().get(i);

            switch (sc.getSelectedNum()) {
                case CharacterNumber.KNIGHT:
                    hp -= ((Knight) sc.getCharacter()).qSkill(monsterSc);
                    break;
                case CharacterNumber.WIZARD:
                    hp -= ((Wizard) sc.getCharacter()).qSkill(monsterSc);
                    break;
                case CharacterNumber.SNIPER:
                    hp -= ((Sniper) sc.getCharacter()).qSkill(monsterSc);
                    break;
                case CharacterNumber.HOLYKING:
                    hp -= ((HolyKing) sc.getCharacter()).qSkill(monsterSc);
                    break;
                case CharacterNumber.ASSASSIN:
                    hp -= ((Assassin) sc.getCharacter()).qSkill(monsterSc);
                    break;
            }
        }
    }
}
