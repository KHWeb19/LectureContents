import java.util.ArrayList;
import java.util.Scanner;

public class CharacterManager {
    // 이 클래스는 도대체 어떤 업무를 담당하는가 ?
    // 전체 캐릭터를 관리해주는 클래스다!
    // 1. 우선적으로 레이드 멤버를 관리하도록 한다.
    // 2. 그 외적인 요소들도 있겠지만 우선은 레이드만 신경쓰도록 해보자
    //    (그래야 신기능이 추가될때 또 고려할 것이 있다는 것을 볼 수가 있다)

    private final Scanner scan = new Scanner(System.in);

    // 여기서 SelectedCharacter라는 클래스를 추가한 이유는 무엇인가 ?
    // 실제로 Wizard, Knight 등을 이 member에 넣는다고 할 경우
    // 역시나 Object로 받아야 하는 문제점이 있다.
    // SelectedCharacter는 앞서서 RolePlayingGame에서
    // 두 개의 ArrayList를 사용해서 Integer와 Object를 처리 했는데
    // 이 작업 처리 자체를 SelectedCharacter로 위임하여 추상화를 하기 위함이다.
    private ArrayList<SelectedCharacter> member;

    public CharacterManager() {
        member = new ArrayList<>();
    }

    public void printPartyInfo () {
        SelectedCharacter sc;

        for (int i = 0; i < member.size(); i++) {
            sc = member.get(i);

            switch (sc.getSelectedNum()) {
                case CharacterNumber.KNIGHT:
                    System.out.println(((Knight) sc.getCharacter()));
                    break;

                case CharacterNumber.WIZARD:
                    System.out.println(((Wizard) sc.getCharacter()));
                    break;

                case CharacterNumber.SNIPER:
                    System.out.println(((Sniper) sc.getCharacter()));
                    break;

                case CharacterNumber.HOLYKING:
                    System.out.println(((HolyKing) sc.getCharacter()));
                    break;

                case CharacterNumber.ASSASSIN:
                    System.out.println(((Assassin) sc.getCharacter()));
                    break;
            }
        }
    }

    public void procUserInput (int num) {
        SelectedCharacter sc;

        switch (num) {
            case CharacterNumber.KNIGHT:
                Knight kni = new Knight();
                sc = new SelectedCharacter(
                        CharacterNumber.KNIGHT, kni);
                member.add(sc);
                break;

            case CharacterNumber.WIZARD:
                Wizard wiz = new Wizard();
                sc = new SelectedCharacter(
                        CharacterNumber.WIZARD, wiz);
                member.add(sc);
                break;

            case CharacterNumber.SNIPER:
                Sniper sni = new Sniper();
                sc = new SelectedCharacter(
                        CharacterNumber.SNIPER, sni);
                member.add(sc);
                break;

            case CharacterNumber.HOLYKING:
                HolyKing hk = new HolyKing();
                sc = new SelectedCharacter(
                        CharacterNumber.HOLYKING, hk);
                member.add(sc);
                break;

            case CharacterNumber.ASSASSIN:
                Assassin sin = new Assassin();
                sc = new SelectedCharacter(
                        CharacterNumber.ASSASSIN, sin);
                member.add(sc);
                break;
            default:
                break;
        }
    }

    public void chooseMember () {
        int cnt = 0;

        System.out.println("1번: 기사, 2번: 위자드, 3번: 스나이퍼, 4번: 성황, 5번: 어쌔신");

        while (cnt < 3) {
            System.out.print("번호를 입력하세요: ");
            int num = scan.nextInt();

            if (num >= 6 || num <= 0) {
                continue;
            }

            cnt++;

            procUserInput(num);
        }
    }
    public int memberSize () {
        return member.size();
    }
    public ArrayList<SelectedCharacter> getMemberArrayList () {
        return member;
    }
}
