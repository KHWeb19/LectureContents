public class Dice {
    final int MAX = 6;
    final int MIN = 1;

    int diceNum;
    int range;

    public void initDice () {
        range = MAX - MIN + 1;
    }

    public int rollDice () {
        return (int) (Math.random() * range + MIN);
    }
}
