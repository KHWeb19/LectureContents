public class Dice {
    final int MAX = 6;
    final int MIN = 1;

    int range;

    public Dice () {
        System.out.println("나는 Dice 클래스의 기본 생성자!");
        range = MAX - MIN + 1;
    }

    public int rollDice () {
        return (int) (Math.random() * range + MIN);
    }
}
