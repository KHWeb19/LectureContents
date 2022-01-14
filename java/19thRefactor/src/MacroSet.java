import java.util.ArrayList;

public class MacroSet {

    public MacroSet () {
        System.out.println("매크로 구동 준비 완료!");
    }

    public void doMacroSet (CharacterManager cm) throws InterruptedException {
        ArrayList<SelectedCharacter> member = cm.getMemberArrayList();
        FieldMonster fm = new FieldMonster();

        SelectedCharacter sc;

        for (int i = 0; i < member.size(); i++) {
            sc = member.get(i);

            switch (sc.getSelectedNum()) {
                case CharacterNumber.KNIGHT:
                    System.out.println(((Knight) sc.getCharacter()).qSkill(fm));
                    break;

                case CharacterNumber.WIZARD:
                    System.out.println(((Wizard) sc.getCharacter()).qSkill(fm));
                    break;

                case CharacterNumber.SNIPER:
                    System.out.println(((Sniper) sc.getCharacter()).qSkill(fm));
                    break;

                case CharacterNumber.HOLYKING:
                    System.out.println(((Sniper) sc.getCharacter()).qSkill(fm));
                    break;

                case CharacterNumber.ASSASSIN:
                    System.out.println(((Sniper) sc.getCharacter()).qSkill(fm));
                    break;
            }
        }
    }
}
