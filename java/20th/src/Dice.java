public class Dice {

    final int MAX = 6;
    final int MIN = 1;

    int range;

    public Dice(){
        range = MAX - MIN +1;
    }

    public int rollDice(){
        return (int)(Math.random() * range + MIN);
    }
}