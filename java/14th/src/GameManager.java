public class GameManager {
    Player[] players;
    int playerNum;

    public GameManager (final int playerNum, final int diceCnt) {
        this.playerNum = playerNum;
        players = new Player[playerNum];

        for (int i = 0; i < playerNum; i++) {
            players[i] = new Player(diceCnt);
        }
    }

    public void rollPlayerDice () {
        for (int i = 0; i < playerNum; i++) {
            players[i].rollEveryDice();
        }
    }

    public void rollSpecialDice () {
        for (int i = 0; i < playerNum; i++) {
            if (players[i].checkSpecialDice()) {
                players[i].rollSpecialDice();
            }
        }
    }

    public void applySkillEffect () {
        int tmp;
        for (int i = 0; i < playerNum; i++) {
            if (players[i].isGetSpecial()) {
                switch (tmp = players[i].getSpecialDiceNum()) {
                    case 1:
                        // 1번의 경우 상대방의 주사위 눈금을 2 떨군다.
                        System.out.println("1번 - 상대 눈금을 2떨굼");
                        for (int j = 0; j < playerNum; j++) {
                            if (i == j) {
                                continue;
                            }

                            players[j].operateDice(-2);
                        }
                        break;
                    case 3:
                        // 3번의 경우 다 같이 -6을 적용한다.
                        System.out.println("3번 - 다같이 6떨굼");
                        for (int j = 0; j < playerNum; j++) {
                            players[j].operateDice(-6);
                        }
                        break;
                    case 4:
                        // 4번의 경우 그냥 패배
                        System.out.println("4번 - 잘가");
                        players[i].operateDice(4444);
                        break;
                    case 6:
                        // 6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
                        System.out.println("6번 - 상대편 3을 뺏어서 내쪽으로 3을 땡겨옴");
                        for (int j = 0; j < playerNum; j++) {
                            if (i == j) {
                                continue;
                            }

                            players[j].operateDice(-3);
                            players[i].operateDice(3);
                        }
                        break;
                    default:
                        System.out.println("디폴트 2, 5!!!");
                        players[i].operateDice(tmp);
                        break;
                }
            }
        }
    }

    public void checkSum () {
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("플레이어 %d - %d\n", i, players[i].getSum());
        }
    }

    public void startGame () {
        System.out.println("주사위 게임 시작!");

        rollPlayerDice();
        checkSum();
        rollSpecialDice();
        applySkillEffect();
    }
}
