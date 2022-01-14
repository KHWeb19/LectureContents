import java.util.ArrayList;

public class MacroSet {

    public MacroSet () {
        System.out.println("매크로 구동 준비 완료!");
    }

    public void doMacroSet (CharacterManager cm) throws InterruptedException {
        ArrayList<SelectedCharacter> member = cm.getMemberArrayList();
        FieldMonster fm = new FieldMonster();

        SelectedCharacter userSc;
        SelectedCharacter monsterSc = new SelectedCharacter(MonsterNumber.FIELD, fm);

        for (int i = 0; i < member.size(); i++) {
            userSc = member.get(i);

            switch (userSc.getSelectedNum()) {
                case CharacterNumber.KNIGHT:
                    System.out.println(((Knight) userSc.getCharacter()).qSkill(monsterSc));
                    break;

                case CharacterNumber.WIZARD:
                    System.out.println(((Wizard) userSc.getCharacter()).qSkill(monsterSc));
                    break;

                case CharacterNumber.SNIPER:
                    System.out.println(((Sniper) userSc.getCharacter()).qSkill(monsterSc));
                    break;

                case CharacterNumber.HOLYKING:
                    System.out.println(((HolyKing) userSc.getCharacter()).qSkill(monsterSc));
                    break;

                case CharacterNumber.ASSASSIN:
                    System.out.println(((Assassin) userSc.getCharacter()).qSkill(monsterSc));
                    break;
            }
        }
    }
}
