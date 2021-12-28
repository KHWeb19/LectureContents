public class Ans8 {
    public static void main(String[] args) {
        /*  2명이 주사위 게임을 한다. (배열 활용)
            주사위는 각자 2개씩 굴릴 수 있다.
            처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
            (2, 4, 6, 8, 10, 12)

            한 번 더 돌리는 주사위는 특수 스킬을 가지고 있다.
            (특수 스킬 주사위는 1번만 굴린다)
            이 특수 스킬들은 1, 3, 4, 6에서 동작한다.

            1번의 경우 상대방의 주사위 눈금을 2 떨군다.
            3번의 경우 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
            4번의 경우 그냥 패배 처리한다.
            6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
            2번, 5번은 그냥 특수 스킬이 동작하지 않고 단순히 더해진다. */

        // 1. 사용자 수: 2
        // 2. 주사위 수: 2
        // 3. 특수 주사위 수: 1 ???
        // 4. 특수 스킬: 1, 3, 4, 6
        // 5. 각 스킬 이펙트 값들 ???
        // 6. 주사위 생성

        final int PLAYER_NUM = 2;
        final int DICE_NUM = 2;

        final int SKILL_NUM1 = 1;
        final int SKILL_NUM2 = 3;
        final int SKILL_NUM3 = 4;
        final int SKILL_NUM4 = 6;

        final int DEATH = 4444;

        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN + 1;

        int dice;
        int[] diceSum = new int[PLAYER_NUM];

        // 2명의 플레이어가 두 개의 주사위를 굴림
        for (int i = 0; i < PLAYER_NUM; i++) {
            // 많이들 실수하는 부분임
            // for문 내부에서 i랑 j랑 바꿔 쓰는 경우를 조심합시다!!!
            for (int j = 0; j < DICE_NUM; j++) {
                dice = (int) (Math.random() * range + MIN);
                diceSum[i] += dice;
            }
        }

        // 각 플레이어들의 주사위 값을 비교해서 특수 주사위를 굴릴지 여부 판정
        for (int i = 0; i < PLAYER_NUM; i++) {

            if (diceSum[i] % 2 == 0) {
                dice = (int) (Math.random() * range + MIN);

                if (dice == SKILL_NUM1) {
                    System.out.println("상대방 주사위 눈금을 2 떨군다.");

                    for (int j = 0; j < PLAYER_NUM; j++) {
                        if (j == i) {
                            continue;   // skip의 의미임
                        }

                        diceSum[j] -= 2;
                    }
                } else if (dice == SKILL_NUM2) {
                    System.out.println("모두 함께 자폭 ^^ -6");

                    for (int j = 0; j < PLAYER_NUM; j++) {
                        diceSum[j] -= 6;
                    }
                } else if (dice == SKILL_NUM3) {
                    System.out.println("그냥 가세요 ㅠㅜ");

                    diceSum[i] = DEATH;
                } else if (dice == SKILL_NUM4) {
                    System.out.println("모두에게서 3씩 뺏어서 내거에 추가한다.");

                    for (int j = 0; j < PLAYER_NUM; j++) {
                        if (i == j) {
                            continue;
                        }

                        diceSum[j] -= 3;
                        diceSum[i] += 3;
                    }
                } else {
                    diceSum[i] += dice;
                }
            }
        }

        // 음수 처리
        for (int i = 0; i < PLAYER_NUM; i++) {
            if (diceSum[i] < 0) {
                diceSum[i] = 0;
            }

            System.out.printf("dice[%d] = %d\n", i, diceSum[i]);
        }

        boolean checkWinner = true;

        for (int i = 0; i < PLAYER_NUM; i++) {
            if (diceSum[i] == DEATH) {
                System.out.printf("플레이어%d가 패배하였습니다!\n", i);
                checkWinner = false;
            }
        }

        // 승부 판정
        if (checkWinner) {
            if (diceSum[0] > diceSum[1]) {
                System.out.println("플레이어 1 승리!");
            } else if (diceSum[0] < diceSum[1]) {
                System.out.println("플레이어 2 승리!");
            } else {
                System.out.println("무승부!");
            }
        }
    }
}
