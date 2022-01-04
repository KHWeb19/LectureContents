import java.util.Arrays;

public class DiceManager {
    int diceNum;

    Dice[] diceArr;
    int sum;

    public DiceManager (int diceNum) {
        sum = 0;
        this.diceNum = diceNum;

        diceArr = new Dice[diceNum];
    }

    public void checkWin (int sum) {
        if (sum % 2 == 0) {
            System.out.println("당첨입니다!!!");
        } else {
            System.out.println("올땐 쉬웠지 갈땐 손모가지닷!");
        }
    }

    public void playDiceGame () {
        int tmp;

        for (int i = 0; i < diceNum; i++) {
            // 주사위 객체 생성
            diceArr[i] = new Dice();
            // 주사위를 굴려야함
            // 합산
            tmp = diceArr[i].rollDice();
            System.out.printf("tmp = %d\n", tmp);
            sum += tmp;
        }

        checkWin(sum);
    }

    @Override
    public String toString() {
        return "DiceManager{" +
                "diceArr=" + Arrays.toString(diceArr) +
                ", sum=" + sum +
                '}';
    }
}

/* 메모리 영역

------------------------------------
| Dice 객체 1 주소 | Dice 객체 2 주소 |    diceArr
------------------------------------
        [0]              [1]

   각각의 Dice 객체는 아래와 같음
    --------------    --------------
    | MAX        |    | MAX        |
    | MIN        |    | MIN        |
    | range      |    | range      |
    -------------|    -------------|
    | Dice()     |    | Dice()     |
    | rollDice() |    | rollDice() |
    --------------    --------------
    
    rollDice를 하고 return을 하면
    배열 객체에 각각의 Dice 객체를
    가지고 있는 것이 의미가 없다고 한 이유
    만약 Dice 객체에 각 주사위가 뽑은 숫자값이 기록된다면
    각각의 주사위 객체를 유지하는 것이 의미가 있음

 */