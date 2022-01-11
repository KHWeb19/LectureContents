public class Dice {
    private final int MAX = 6;
    private final int MIN = 1;

    private int range;
    private int diceNum;

    public Dice() {
        //System.out.println("나는 Dice 클래스의 기본 생성자!");
        range = MAX - MIN + 1;
    }

    public void setDiceNum (int num) {
        diceNum = num;
    }

    public void rollDice () {
        diceNum = (int) (Math.random() * range + MIN);
    }

    public int getDiceNum () {
        return diceNum;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "diceNum=" + diceNum +
                '}';
    }
}
