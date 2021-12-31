public class DiceClass {
    public static void main(String[] args) {
        Dice dice = new Dice();

        dice.initDice();
        System.out.println("주사위 굴리기: " + dice.rollDice());
    }
}
