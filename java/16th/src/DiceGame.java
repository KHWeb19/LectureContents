import java.util.Arrays;

public class DiceGame {
    final int PLAYER_NUM = 2;
    final int DICE_NUM = 2;

    final int DEATH_FLAG = 4000;

    boolean[] deathId;

    private GameManager[] gmArr;

    public DiceGame () {
        // gmArr를 지역변수로 만들었음
        // 그렇기 때문에 생성자 호출이 끝난 시점에서 변수가 증발함
        // GameManager[] gmArr = new GameManager[PLAYER_NUM]; <<<--- 잘못된 코드
        gmArr = new GameManager[PLAYER_NUM];
        deathId = new boolean[PLAYER_NUM];

        for (int id = 0; id < PLAYER_NUM; id++) {
            gmArr[id] = new GameManager(id, DICE_NUM);
        }
    }

    public void startGame () {
        for (int id = 0; id < PLAYER_NUM; id++) {
            gmArr[id].rollEveryDice();
            gmArr[id].checkSpecialDice();
            gmArr[id].rollSpecialDice();
            // gmArr[id].applySkillEffect(id); <<<--- 여기 넣는 방식이면 이렇게 처리하면됨
        }

        // 현재는 재활용 관점에서 접근해서 아래와 같이 활용하였다.
        // 마음에 들지 않는 부분이라면
        // 현재 구조에서는 for 문 밖으로 빠져 나왔는데 applySkillEffect에
        // 여러가지 기능들이 결합되어 있어 아래와 같이 밑으로 빼야하는 상황이다.
        // 이 구조를 조금 더 분리하여 만들었으면 좀 더 예쁜 코드를 만들 수 있었을 것이다.
        applySkillEffect();
    }

    public void checkDeath () {
        for (int id = 0; id < PLAYER_NUM; id++) {
            if (gmArr[id].getSum() > DEATH_FLAG) {
                deathId[id] = true;
            }
        }
    }

    public void settleResult () {
        boolean death = false;

        for (int id = 0; id < PLAYER_NUM; id++) {
            if (deathId[id] == true) {
                System.out.printf("플레이어 %d가 패배하였습니다!\n", id);
                death = true;
            }
        }

        if (!death) {
            int res = gmArr[0].compareTo(gmArr[1]);

            if (res > 0) {
                System.out.println("플레이어 0 승리!");
            } else if (res < 0) {
                System.out.println("플레이어 1 승리");
            } else {
                System.out.println("무승부");
            }
        }
    }

    // 숫자(sum)값이 4000 보다 크다면 무조건 패배이므로 상대편이 승리함
    // 숫자값이 4000인 케이스가 없다면 정상적인 처리가 진행되어야함
    public void printResult() {
        // deathId 부분에서 누가 죽었는지를 알고 있으므로
        // 이를 기반으로 검사를 진행하면 된다.
        checkDeath();
        settleResult();
    }

    // 이 녀석이 왜 지저분한 코드냐 ?
    // 이 코드의 업무를 살펴보자!
    // 1. 일단 선수 숫자만큼 루프를 돈다.
    // 2. 각 선수들이 특수 주사위를 굴리는지 판정한다.
    // 3. 특수 주사위 번호에 따라 정해진 기능을 동작하도록 만든다.
    // 이 여러가지 작업들이 하나의 매서드에서 모두 동작하고 있다는 부분이 문제다.
    // 사실 매서드를 만들다보면 어느정도는 결합을 허용할 수도 있다.
    // 이 부분은 필요에 따라 완급을 조절하면 된다.
    // 현재 구조에서는 applySkillEffect가 for만 빠져 있었어도
    // 위쪽 gameStart()에 집어넣을 수 있었기 때문에
    // 좀 더 깔끔한 형식을 가질 수 있었을 것이라 판정됨
    public void applySkillEffect () {
        int tmp;
        for (int i = 0; i < PLAYER_NUM; i++) {
            if (gmArr[i].isGetSpecial()) {
                switch (tmp = gmArr[i].getSpecialDiceNum()) {
                    case 1:
                        // 1번의 경우 상대방의 주사위 눈금을 2 떨군다.
                        System.out.println("1번 - 상대 눈금을 2떨굼");
                        for (int j = 0; j < PLAYER_NUM; j++) {
                            if (i == j) {
                                continue;
                            }

                            gmArr[j].operateDice(-2);
                        }
                        break;
                    case 3:
                        // 3번의 경우 다 같이 -6을 적용한다.
                        System.out.println("3번 - 다같이 6떨굼");
                        for (int j = 0; j < PLAYER_NUM; j++) {
                            gmArr[j].operateDice(-6);
                        }
                        break;
                    case 4:
                        // 4번의 경우 그냥 패배
                        System.out.println("4번 - 잘가");
                        gmArr[i].operateDice(4444);
                        break;
                    case 6:
                        // 6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
                        System.out.println("6번 - 상대편 3을 뺏어서 내쪽으로 3을 땡겨옴");
                        for (int j = 0; j < PLAYER_NUM; j++) {
                            if (i == j) {
                                continue;
                            }

                            gmArr[j].operateDice(-3);
                            gmArr[i].operateDice(3);
                        }
                        break;
                    default:
                        System.out.println("디폴트 2, 5!!!");
                        gmArr[i].operateDice(tmp);
                        break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "DiceGame{" +
                "PLAYER_NUM=" + PLAYER_NUM +
                ", DICE_NUM=" + DICE_NUM + '\n' +
                ", gmArr=" + Arrays.toString(gmArr) +
                '}';
    }
}
