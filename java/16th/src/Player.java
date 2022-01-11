import java.util.Arrays;

public class Player {
    private int diceCnt;
    private Dice[] diceArr;
    private Dice special;

    private int sum;
    private boolean getSpecial;

    public Player(final int diceCnt) {
        System.out.printf("Player(): diceCnt - %d\n", diceCnt);

        this.diceCnt = diceCnt;
        diceArr = new Dice[diceCnt];

        for (int i = 0; i < diceCnt; i++) {
            diceArr[i] = new Dice();
        }

        special = new Dice();
    }

    public void rollEveryDice () {
        sum = 0;

        System.out.println("Player::rollEveryDice()");

        for (int i = 0; i < diceCnt; i++) {
            diceArr[i].rollDice();
            sum += diceArr[i].getDiceNum();
        }
    }

    public void rollSpecialDice () {
        if (getSpecial) {
            special.rollDice();
            //special.setDiceNum(4);  // 다 같이 죽는 경우 테스트를 위해서
        }
    }

    // 기능 두 가지가 결합되면
    // 이렇게 필요 없을 경우에도 기능이 살아있어서 짜증나는 경우들이 있음
    // 실제로 이 코드는 값을 얻는 getter와 boolean을 설정하는 작업이 결합되어 있음
    // (실제로 좋은 형식은 이 둘을 분리하는 것임)
    // ex) 지금 처럼 귀찮다고 그냥 결합하면 현재 예제와 같은 불상사를 겪게 됨
    //     현재는 코드 작성이 많지 않아서 다행이지만
    //     규모가 커질수록 이러한 상황의 파급력이 나비효과가 될 수 있음
    public boolean checkSpecialDice () {
        if (sum % 2 == 0) {
            getSpecial = true;
            return getSpecial;  // <<<--- 이거 정말 필요했던건가요 ?
        } else {
            getSpecial = false;
            return getSpecial;
        }
    }

    public boolean isGetSpecial() {
        return getSpecial;
    }

    public int getSpecialDiceNum () {
        return special.getDiceNum();
    }

    public void operateDice (int num) {
        sum += num;

        if (sum < 0) {
            sum = 0;
        }
    }

    public int getSum () {
        return sum;
    }

    @Override
    public String toString() {
        return "Player{" +
                "diceCnt=" + diceCnt +
                ", diceArr=" + Arrays.toString(diceArr) +
                ", special=" + special +
                ", sum=" + sum +
                ", getSpecial=" + getSpecial +
                '}';
    }
}
