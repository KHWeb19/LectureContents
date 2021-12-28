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

// Q. 어떤 경우 for로 묶어야 하고 어떤 경우 if 처리를 해야하나요 ?
// A. 사실 이것은 어느정도 감각적인 부분입니다.
//    그러므로 많은 연습을 통해 감으로 활용하셔야 합니다.
//    그러나 이론적으로 접근을 해보자면
//    for 케이스: 반복적으로 검사가 필요하다면 for로 묶습니다.
//    if 케이스: 반복 검사가 필요 없다면 그냥 if로 처리
//    ex) 현재 케이스는 반복적으로 검사가 필요해서 for 내부에서 if를 사용하고 있음

// Q. for에서 i를 쓰는것과 j를 쓰는것에 어떤 차이점이 있나요 ?
// A. 변수 이름은 고유합니다.
//    즉 변수 이름은 내가 사용하는 재활용 박스에 해당함
//    같은 이름을 사용한다면 레알 재활용
//    다른 이름이라면 기준을 다르게 보겠다는 의미입니다.

// ex)  for (int i = 0; i < 2; i++) {
//          for (int j = 0; j < 2; j++) {
//              ~~~~~
//              이 케이스는 실제 i, j가 분리된 형식으로
//              for 문 내부에서 또 다른 for 문을 돌리기 위함
//          }
//      }

//       0   1      i
//  0  |   |   |
//     ---------
//  1  |   |   |
//  j

// 이런 형식으로 i는 가로로 이동하거나 j는 세로로 이동하고자 할 때 사용하기도 함
// 혹은 앞서 다뤘던 다른 예제처럼 첫 번째 루프 i는 연(1년, 2년, 3년, ...)
// 내부에서 사용하는 for의 j는 사람의 숫자(A, B, C, D, E, ...) 형식으로 활용 가능