import java.util.ArrayList;

public class DamageCalcRequestObject {
    private float pAtk, mAtk;
    private float hp, mp;
    private float pDef, mDef;
    private float str, con, dex, agi, iq, men;

    public void procDamageCalcRequestObject (SelectedCharacter monsterSc) {
        switch (monsterSc.getSelectedNum()) {
            case MonsterNumber.FENRYL:
                procAllData((Fenryl) monsterSc.getCharacter());
                break;

            case MonsterNumber.FIELD:
                procAllData((FieldMonster) monsterSc.getCharacter());
                break;
        }
    }

    public void procAllData (Fenryl fenryl) {
        pAtk = fenryl.pAtk;
        mAtk = fenryl.mAtk;
        hp = fenryl.hp;
        mp = fenryl.mp;
        pDef = fenryl.pDef;
        mDef = fenryl.mDef;
        str = fenryl.str;
        con = fenryl.con;
        dex = fenryl.dex;
        agi = fenryl.agi;
        iq = fenryl.iq;
        men = fenryl.men;
    }

    public void procAllData (FieldMonster fieldMonster) {
        pAtk = fieldMonster.pAtk;
        mAtk = fieldMonster.mAtk;
        hp = fieldMonster.hp;
        mp = fieldMonster.mp;
        pDef = fieldMonster.pDef;
        mDef = fieldMonster.mDef;
        str = fieldMonster.str;
        con = fieldMonster.con;
        dex = fieldMonster.dex;
        agi = fieldMonster.agi;
        iq = fieldMonster.iq;
        men = fieldMonster.men;
    }

    public float getpAtk() {
        return pAtk;
    }

    public float getmAtk() {
        return mAtk;
    }

    public float getHp() {
        return hp;
    }

    public float getMp() {
        return mp;
    }

    public float getpDef() {
        return pDef;
    }

    public float getmDef() {
        return mDef;
    }

    public float getStr() {
        return str;
    }

    public float getCon() {
        return con;
    }

    public float getDex() {
        return dex;
    }

    public float getAgi() {
        return agi;
    }

    public float getIq() {
        return iq;
    }

    public float getMen() {
        return men;
    }
}
